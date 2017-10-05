package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.ProductoDAO;
import dao.TiendaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import vo.PersonaVO;
import vo.ProductoVO;
import vo.TiendaVO;
import vo.VendedorVO;

/**
 *
 * @author Carlos Alberto
 */
//@WebServlet(urlPatterns = {"/CrearTiendaServlet"})
public class CrearTiendaServlet extends HttpServlet {
    private TiendaDAO tienda;
    
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
//        try (PrintWriter out = response.getWriter()) {
//            this.tienda= new TiendaDAO();
//            /* TODO output your page here. You may use following sample code. */
//            
//            ArrayList<String> prod = new ArrayList<>();
//            
//            String nombre = request.getParameter("nombre");
//            String celularV = request.getParameter("celular");
//            String IDFondo = request.getParameter("fondo");
//            //prod.add(request.getParameter("productos"));
//            
//            TiendaVO tiendaVO = new TiendaVO();
////            VendedorVO vendedorVO = new VendedorVO();
//            //String cel = vendedorVO.getCelular();
//            tiendaVO.setNombre(nombre);
//            tiendaVO.setVendedor(celularV);
//            //tiendaVO.setVendedor(vendedorVO.getCelular());
//            tiendaVO.setIdFondo(IDFondo);
//            //tiendaVO.setProducto(prod);
//                  
//            
//            JSONObject json = new JSONObject();
//            
//            if (!this.tienda.insertar(tiendaVO)) {
//                json.put("confirmacion","NAK");
//                System.out.println("No se pudo crear la tienda");
//            } else {
//                json.put("confirmacion","ACK");
//                System.out.println("Tienda creada exitosamente");
//            }
//
//            out.print(json);
//            
//        }
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
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            this.tienda= new TiendaDAO();
            /* TODO output your page here. You may use following sample code. */
            
            ArrayList<String> prod = new ArrayList<>();
            
            String nombre = request.getParameter("nombre");
            String celularV = request.getParameter("celular");
            String IDFondo = request.getParameter("fondo");
            
            
            TiendaVO tiendaVO = new TiendaVO();
            tiendaVO.setNombre(nombre);
            tiendaVO.setVendedor(celularV);
            tiendaVO.setIdFondo(IDFondo);
                  
            
            JSONObject json = new JSONObject();
            
            if (!this.tienda.insertar(tiendaVO)) {
                json.put("confirmacion","NAK");
                System.out.println("No se pudo crear la tienda");
            } else {
                json.put("confirmacion","ACK");
                System.out.println("Tienda creada exitosamente");
            }

            out.print(json);
            
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
