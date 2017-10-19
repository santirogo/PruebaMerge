/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.Conexion;
import vo.CarritoVO;
import vo.ProductoVO;

/**
 *
 * @author Carlos Alberto
 */
public class CarritoDAO {

    private Connection conexion;
    private CarritoVO carritoVO;

    public CarritoDAO() {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }

    public ArrayList Agregar(ArrayList producto, ArrayList<ProductoVO> sesion) {
        boolean b = false;

        int x = 0;

        for (int i = 0; i < sesion.size(); i++) {
            this.carritoVO.agregarProducto(sesion.get(i));
        }

        String query = "select * from productos where nombre='" + producto.get(0) + "' and tienda='" + producto.get(1) + "'";

        try {
            PreparedStatement preparedStmt = null;
            Statement st = this.conexion.createStatement();
            ResultSet rs = st.executeQuery(query);

            ArrayList carro = new ArrayList();
            ProductoVO prod = new ProductoVO();

            if (rs != null) {

                if (this.carritoVO.getProductos() == null) { //Revisa si esta vacio para agregar
                    while (rs.next()) {

                        prod.setID(rs.getString(1));
                        prod.setNombre(rs.getString(2));
                        prod.setCategoria(rs.getString(3));
                        prod.setPrecio(rs.getInt(4));
                        prod.setCantidad((int) producto.get(2));
                        prod.setTienda(rs.getInt(6));

                    }
                    this.carritoVO.agregarProducto(prod);
                    b = true;
                    return this.carritoVO.getProductos();
                } else {
                    int i = 0;
                    for (i = 0; i < this.carritoVO.getProductos().size(); i++) {
                        //Aumenta la cantidad del producto ya ingresado
                        if (producto.get(0).equals(this.carritoVO.getProductos().get(i).getNombre())) {
                                int cant= this.carritoVO.getProductos().get(i).getCantidad();
                                int cant2= (int) producto.get(2);
                            this.carritoVO.getProductos().get(i).setCantidad(cant+cant2);
                            
                        }

                    }
                    
                    if (i==this.carritoVO.getProductos().size()){
                    
                    
                    }

                }

            } else {
                System.out.println("PRODUCTO NO ENCONTADO :/");

            }

        } catch (SQLException e) {
            System.out.println("Failed to make insertion!");
            e.printStackTrace();
        }

        return this.carritoVO.getProductos();
    }

    public String Precio() {
        ProductoVO productos = new ProductoVO();
        ArrayList<ProductoVO> productosVO = carritoVO.getProductos();
        int x = 0;
        for (int i = 0; i < productosVO.size(); i++) {
            productos = productosVO.get(i);
            x = productos.getPrecio() + x;
        }

        String xs = Integer.toString(x);
        return xs;
    }

    public String Cantidad() {
        ArrayList<ProductoVO> productosVO = carritoVO.getProductos();
        int x = productosVO.size();

        String xs = Integer.toString(x);
        return xs;
    }

    public String PrecioTotal(ArrayList<ProductoVO> CarroSesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void borrar(String nombre, String tienda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
