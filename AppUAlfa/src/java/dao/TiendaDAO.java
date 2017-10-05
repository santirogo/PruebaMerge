package dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexion;
import vo.ProductoVO;
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

    public boolean insertar(TiendaVO tienda) {
        Boolean b;

        try {

            String query = "INSERT INTO Tiendas (nombre, vendedor, puntuacion, idfondo)"
                    + " values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = this.conexion.prepareStatement(query);

            preparedStmt.setString(1, tienda.getNombre());
            preparedStmt.setString(2, tienda.getVendedor());
            preparedStmt.setDouble(3, tienda.getPuntuacion());
            preparedStmt.setString(4, tienda.getIdFondo());

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

    public ArrayList<TiendaVO> listarTodo() {
        //1.Consulta
        ArrayList<TiendaVO> respuesta = new ArrayList();
        String consulta = "SELECT * FROM Tiendas";
        try {
            //----------------------------
            //Statement
            Statement statement
                    = this.conexion.createStatement();
            //Ejecucion
            ResultSet resultado
                    = statement.executeQuery(consulta);
            //----------------------------
            //Recorrido sobre el resultado
            while (resultado.next()) {

                String nombre = resultado.getString("nombre");
                String vendedor = resultado.getString("vendedor");
                double puntuacion = resultado.getDouble("puntuacion");
                String idfondo = resultado.getString("idfondo");
                
                TiendaVO t = new TiendaVO();
                t.setNombre(nombre);
                t.setVendedor(vendedor);
                t.setPuntuacion(puntuacion);
                t.setIdFondo(idfondo);
                respuesta.add(t);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return respuesta;
    }
}
