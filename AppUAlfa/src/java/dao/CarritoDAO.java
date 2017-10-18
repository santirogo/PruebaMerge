/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.gson.Gson;
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
    private CarritoVO carritoVO = CarritoVO.getCarrito();
    
    
    public CarritoDAO() {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }
    
    
    public boolean Agregar(ArrayList producto){
        boolean b=false;

        System.out.println("NFREKGVNERKFNEK"+producto.get(0));
        System.out.println("NFREKGVNERKFNEK"+producto.get(1));
        
        int x = 0;
        
        String query = "select * from productos where nombre='"+producto.get(0)+"' and tienda="+producto.get(1);

        try {
            PreparedStatement preparedStmt = null;
            Statement st = this.conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
//            ArrayList<ProductoVO> productosVO = carritoVO.getProductos();
            ArrayList carro = new ArrayList();
            ProductoVO prod= new ProductoVO();
            
            
            if(rs!=null){
                
            
                while (rs.next()) {
                    System.out.println("WHILEEEEEEE");
                    prod.setNombre(rs.getString(1));
                    System.out.println(rs.getString(1));
                    prod.setCategoria(rs.getString(2));
                    prod.setPrecio(rs.getInt(3));              
                    prod.setTienda(rs.getInt(6));

               }
                
                
                carritoVO.agregarProducto(prod);
                System.out.println(prod);
                b=true;
                return b;
            
            
            
            }else{
                System.out.println("PRODUCTO NO ENCONTADO :/");
            
            }
    
        } catch (SQLException e) {
            System.out.println("Failed to make insertion!");
            e.printStackTrace();
        }
        
        return b;
    }
    
    
    public String Precio(){
        ProductoVO productos = new ProductoVO();
        ArrayList<ProductoVO> productosVO = carritoVO.getProductos();
        int x=0;
        System.out.println("ANTES DE FOOOOOOTTT"+productosVO.size());
        for (int i = 0; i < productosVO.size(); i++) {
            System.out.println("FOOOOOOOOOOOORRRRRRRR");
            productos=productosVO.get(i);
            x=productos.getPrecio()+x;
        }
       
        String xs= Integer.toString(x);
        System.out.println("XXXXXSSSS "+xs);
        return xs;
    }
    
    
    public String Cantidad(){
        ArrayList<ProductoVO> productosVO = carritoVO.getProductos();
        int x= productosVO.size();
        
        String xs = Integer.toString(x);
        return xs;
    }
      
}
