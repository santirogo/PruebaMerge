package dao;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.json.Json;
import util.Conexion;
import vo.ProductoVO;

public class ProductoDAO {
    private Connection conexion;

    public ProductoDAO() {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }
    
    public boolean insertar(ProductoVO producto) {
        boolean resultado = false;
        try {
            //1.Establecer la consulta
            String consulta = "INSERT INTO Productos(nombre, categoria, precio, cantidad, tienda)"
                    + "VALUES(?,?,?,?,?)";
            //2. Crear el PreparedStament
            PreparedStatement statement
                    = this.conexion.prepareStatement(consulta);
            //-----------------------------------
            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getCategoria());
            statement.setInt(3, producto.getPrecio());
            statement.setInt(4, producto.getCantidad());
            statement.setInt(5, producto.getTienda());
            statement.setString(6, producto.getRutaImagen());
            //--------------------------------------
            //3. Hacer la ejecucion
            resultado = statement.execute();
            resultado=true;
            return resultado;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return resultado;
        }

    }
    
    public ArrayList<ProductoVO> listarTodo(){
       //1.Consulta
       ArrayList<ProductoVO> respuesta = new ArrayList<ProductoVO>();
       String consulta ="SELECT * FROM Productos";
        try {
            //----------------------------
            //Statement
            Statement statement =
                    this.conexion.createStatement();
            //Ejecucion
            ResultSet resultado = 
                    statement.executeQuery(consulta);
            //----------------------------
            //Recorrido sobre el resultado
            while(resultado.next()){
                respuesta.add((ProductoVO) resultado);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return respuesta;
    }
    
    public boolean editar(ProductoVO producto) {
        boolean result = false;
        String query = "update Productos set Categoria = ?, Precio = ?, Cantidad = ? where Nombre = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = this.conexion.prepareStatement(query);
            preparedStmt.setString(1, producto.getCategoria());
            preparedStmt.setInt(2, producto.getPrecio());
            preparedStmt.setInt(3, producto.getCantidad());
            preparedStmt.setString(4, producto.getNombre());
            
            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public boolean borrar(ProductoVO producto) {
        boolean result = false;
        String query = "delete from Productos where Nombre = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = this.conexion.prepareStatement(query);
            preparedStmt.setString(1, producto.getNombre());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public String enviar() throws SQLException{
        
        String query="Select * from productos";
        PreparedStatement preparedStmt = null;
        
        ArrayList Arreglo = new ArrayList();
                Arreglo.clear();
           

                    Statement st = this.conexion.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {
                        Arreglo.add(rs.getString(1));
                        Arreglo.add(rs.getInt(3));
                    }

                    return new Gson().toJson(Arreglo);
    
    }
    
    public ArrayList productosPorTienda(int id){
        //1.Consulta
       ArrayList<ProductoVO> respuesta = new ArrayList<ProductoVO>();
       String consulta ="SELECT * FROM Productos WHERE tienda = "+id;
        try {
            //----------------------------
            //Statement
            Statement statement =
                    this.conexion.createStatement();
            //Ejecucion
            ResultSet resultado = 
                    statement.executeQuery(consulta);
            //----------------------------
            //Recorrido sobre el resultado
            while(resultado.next()){
                String name = resultado.getString("nombre");
                int precio = resultado.getInt("precio");
                String imagen = resultado.getString("imagen");
                int tienda = resultado.getInt("tienda");
                ProductoVO p = new ProductoVO();
                p.setNombre(name);
                p.setPrecio(precio);
                p.setRutaImagen(imagen);
                p.setTienda(id);
                respuesta.add(p);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return respuesta;
    }
}
