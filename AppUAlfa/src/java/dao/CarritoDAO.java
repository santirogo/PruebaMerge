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

/**
 *
 * @author Carlos Alberto
 */
public class CarritoDAO {
    
    private Connection conexion;
    
    public CarritoDAO() {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }
    
    
    public boolean AgregarProd(ArrayList producto) {
        boolean b=true;
        
        ArrayList Carro = new ArrayList();
        for (int i = 0; i < producto.size(); i++) {
            Carro.add(producto.get(i));
        }
        CarritoVO carrito= new CarritoVO();
         try {

            String query = " insert into Carrito (nombre, precio)"
                    + " values (?, ?)";

            PreparedStatement preparedStmt = null;

            preparedStmt = this.conexion.prepareStatement(query);

             for (int i = 0; i < Carro.size(); i++) {
                 
                 String nombre= (String) Carro.get(i);
                 int precio = (int) Carro.get(i+1);
                 
                 preparedStmt.setString(1, nombre); 
                 preparedStmt.setInt(2, precio);
                 
             }
            
            preparedStmt.executeUpdate();

            System.out.println("You made it, the insertion is ok!");
            b = true;
            return b;

        } catch (SQLException e) {
            System.out.println("Failed to make insertion!");
            b = false;
            e.printStackTrace();
        }
        return b;

    
    }
    
    
    public int precioTotal(){
       
        int x = 0;
        String query = "select SUM(Precio) from Carrito";

        try {
            Statement st = this.conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                x = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Failed to make insertion!");
            x = 0;
            e.printStackTrace();
        }

        return x;
        
    }
    
    
    public int cantidadTotal(){
       
        int x = 0;
        String query = "select COUNT(nombre) from Carrito";

        try {
            Statement st = this.conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                x = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Failed to make insertion!");
            x = 0;
            e.printStackTrace();
        }

        return x;
        
    } 
        
    public void vaciarCarrito() throws SQLException{
    
        PreparedStatement preparedStmt = null;
        String query = "truncate Carrito";
    
        
        preparedStmt = this.conexion.prepareStatement(query);
        preparedStmt.executeUpdate();
    
    
    }
    
}
