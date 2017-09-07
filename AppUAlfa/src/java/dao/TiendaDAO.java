/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexion;
import vo.PersonaVO;
import vo.TiendaVO;

/**
 *
 * @author Carlos Alberto
 */
public class TiendaDAO {

    private Connection conexion;

    public TiendaDAO() {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }

    public boolean insertar(TiendaVO tienda, String celular) {
        Boolean b;

        Connection connection = null;

        try {

            String query = " insert into Tienda (nombre, categoria, IDTienda, IDFondo)"
                    + " values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = null;

            preparedStmt = connection.prepareStatement(query);

            preparedStmt.setString(1, tienda.getNombre());
            preparedStmt.setString(2, tienda.getCategoria());
            preparedStmt.setString(3, celular);
            preparedStmt.setString(4, tienda.getIdFondo()); 
           
            ArrayList arraypro =tienda.getProducto();
            String productocapo=(String) arraypro.get(0);
            preparedStmt.setString(5, productocapo);
            
            
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

}
