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
import vo.VendedorVO;

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

    public boolean insertar(TiendaVO tienda) {
        Boolean b;

        try {

            String query = " insert into Tienda (nombre, celular, idfondo, puntuacion)"
                    + " values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = null;

            preparedStmt = this.conexion.prepareStatement(query);

            preparedStmt.setString(1, tienda.getNombre()); 
            preparedStmt.setString(2, tienda.getVendedor());
            preparedStmt.setString(3, tienda.getIdFondo()); 
           
            
            
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
