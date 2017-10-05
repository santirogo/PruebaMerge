/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import vo.ProductoVO;

/**
 *
 * @author ayoro
 */
public class AgregarProductoServlet extends HttpServlet {
    private ProductoDAO producto;
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
            String celular = request.getParameter("tienda");
            
            ProductoVO productoVO = new ProductoVO();
            JSONObject json = new JSONObject();
            
            
            
            //switch(nombre){
                
                
                    
            productoVO.setNombre(nombre);
            productoVO.setCategoria(categoria);
            productoVO.setPrecio(precio);
            productoVO.setCantidad(tienda);
            productoVO.setTienda(celular);
            productoVO.setRutaImagen("margarita.jpg");
            
            if (!this.producto.insertar(productoVO)) {
                json.put("confirmacion","NAK");
                System.out.println("No se pudo agregar producto");
            } else {
                json.put("confirmacion","ACK");
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
        processRequest(request, response);
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
            this.producto = new ProductoDAO();
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String categoria = request.getParameter("categoria");
            int precio = Integer.parseInt(request.getParameter("precio"));
            int tienda = Integer.parseInt(request.getParameter("cantidad"));
            String celular = request.getParameter("tienda");
            
            ProductoVO productoVO = new ProductoVO();
            JSONObject json = new JSONObject();
            
            
            
            //switch(nombre){
                
                
                    
            productoVO.setNombre(nombre);
            productoVO.setCategoria(categoria);
            productoVO.setPrecio(precio);
            productoVO.setCantidad(tienda);
            productoVO.setTienda(celular);
            productoVO.setRutaImagen("margarita.jpg");
            
            if (!this.producto.insertar(productoVO)) {
                json.put("confirmacion","NAK");
                System.out.println("No se pudo agregar producto");
            } else {
                json.put("confirmacion","ACK");
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
