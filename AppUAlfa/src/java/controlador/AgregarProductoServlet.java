/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ProductoDAO;
import dao.TiendaDAO;
import dao.VendedorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONObject;
import vo.ProductoVO;
import vo.TiendaVO;

/**
 *
 * @author ayoro
 */
public class AgregarProductoServlet extends HttpServlet {

    private ProductoDAO producto;
    private ArrayList<String> categorias;
    private TiendaDAO tienda;
    private TiendaVO tVO;
    private JSONObject json;
    private JSONArray array;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            this.producto = new ProductoDAO();
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String categoria = request.getParameter("categoria");
            int precio = Integer.parseInt(request.getParameter("precio"));
            int tienda = Integer.parseInt(request.getParameter("cantidad"));
            int idTienda = Integer.parseInt(request.getParameter("tienda"));

            ProductoVO productoVO = new ProductoVO();
            JSONObject json = new JSONObject();

            //switch(nombre){
            productoVO.setNombre(nombre);
            productoVO.setCategoria(categoria);
            productoVO.setPrecio(precio);
            productoVO.setCantidad(tienda);
            productoVO.setTienda(idTienda);
            productoVO.setRutaImagen("margarita.jpg");

            if (!this.producto.insertar(productoVO)) {
                json.put("confirmacion", "NAK");
                System.out.println("No se pudo agregar producto");
            } else {
                json.put("confirmacion", "ACK");
                System.out.println("Producto agregado exitosamente");
            }

            out.print(json);

//            case 2: 
//                    
//            productoVO.setNombre("Papas Margarita Limon");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            productoVO.setRutaImagen("margarita2.jpg");
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 3: 
//                    
//            productoVO.setNombre("Papas Margarita Natural");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 4: 
//                    
//            productoVO.setNombre("Papas Margarita Pollo");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            productoVO.setRutaImagen("margarita.jpg");
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 5: 
//                    
//            productoVO.setNombre("Mama Ia Ia");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 6: 
//                    
//            productoVO.setNombre("Trident Menta");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 7: 
//                    
//            productoVO.setNombre("Trident Canela");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 8: 
//                    
//            productoVO.setNombre("Trident Mora Azul");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 9: 
//                    
//            productoVO.setNombre("Cheetos");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 10: 
//                    
//            productoVO.setNombre("Ponky");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            this.producto = new ProductoDAO();
            this.categorias = producto.getCategorias();

            array = new JSONArray();

            for (String cat : categorias) {

                json = new JSONObject();

                json.put("cat", cat);
                array.put(json);
            }
            JSONObject mainJson = new JSONObject();
            mainJson.put("categorias", array);

            out.print(mainJson);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("PPPOOOOOOOOOOSSSSSSSSSTTTTTT");
            this.producto = new ProductoDAO();
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String categoria = request.getParameter("categoria");
            int precio = Integer.parseInt(request.getParameter("precio"));
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));
            String imagen = request.getParameter("imagen");
            //int idTienda = Integer.parseInt(request.getParameter("tienda"));
            HttpSession mySession = request.getSession();
            String correo = (String) mySession.getAttribute("correo");
            VendedorDAO vDAO = new VendedorDAO();
            String celular = vDAO.buscarCelVendedor(correo);
            this.tienda = new TiendaDAO();
            this.tVO = tienda.mostrarPorVendedor(celular);
            int idTienda = tVO.getId();

            ProductoVO productoVO = new ProductoVO();
            JSONObject json = new JSONObject();

            //switch(nombre){
            productoVO.setNombre(nombre);
            productoVO.setCategoria(categoria);
            productoVO.setPrecio(precio);
            productoVO.setCantidad(cantidad);
            productoVO.setTienda(idTienda);
            productoVO.setRutaImagen(imagen);

            if (!this.producto.insertar(productoVO)) {
                json.put("confirmacion", "NAK");
                System.out.println("No se pudo agregar producto");
            } else {
                json.put("confirmacion", "ACK");
                System.out.println("Producto agregado exitosamente");
            }

            out.print(json);

//            case 2: 
//                    
//            productoVO.setNombre("Papas Margarita Limon");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            productoVO.setRutaImagen("margarita2.jpg");
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 3: 
//                    
//            productoVO.setNombre("Papas Margarita Natural");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 4: 
//                    
//            productoVO.setNombre("Papas Margarita Pollo");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            productoVO.setRutaImagen("margarita.jpg");
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 5: 
//                    
//            productoVO.setNombre("Mama Ia Ia");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 6: 
//                    
//            productoVO.setNombre("Trident Menta");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 7: 
//                    
//            productoVO.setNombre("Trident Canela");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 8: 
//                    
//            productoVO.setNombre("Trident Mora Azul");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 9: 
//                    
//            productoVO.setNombre("Cheetos");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            case 10: 
//                    
//            productoVO.setNombre("Ponky");
//            productoVO.setCategoria(categoria);
//            productoVO.setPrecio(precio);
//            productoVO.setCantidad(cantidad);
//            productoVO.setTienda(celular);
//            
//            if (!this.producto.insertar(productoVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo agregar producto");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Producto agregado exitosamente");
//            }
//            
//            out.print(json);
//            ;
//            
//            }
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
