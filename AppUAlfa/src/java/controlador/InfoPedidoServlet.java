package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.PedidosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import vo.PedidosVO;

/**
 *
 * @author Carlos Alberto
 */
public class InfoPedidoServlet extends HttpServlet {
            private String id;
            private String check; 

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InfoPedidoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InfoPedidoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
            System.out.println("InfoPedidoServlet por get: ");
        
            String idpedido= request.getParameter("id");
            String checkpedido = request.getParameter("entrega");
            System.out.println("id: "+idpedido);
            System.out.println("entrega: "+checkpedido);
            this.id = idpedido;
            this.check=checkpedido;
        
            
            
            
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
        try (PrintWriter out = response.getWriter()) {
        
        
        
        System.out.println("InfoPedidoServlet por post: ");
        
        PedidosVO pedidoVO = new PedidosVO();
            PedidosDAO pedidoDAO = new PedidosDAO();
            JSONArray array = new JSONArray();
            
            
            
            
            pedidoVO = pedidoDAO.infoPedido(this.id);
            
            
            
            
            JSONObject json = new JSONObject();
            

            json.put("id",pedidoVO.getID());
            json.put("vendedor", pedidoVO.getVendedor());
            json.put("comprador",pedidoVO.getComprador());
            json.put("productos",pedidoVO.getProductos());
            json.put("comentario",pedidoVO.getComentario());
            json.put("checker",String.valueOf(pedidoVO.getChecker()));
            array.put(json);
                   
            
            JSONObject mainJson = new JSONObject();
            mainJson.put("pedidos",array);
            
            
            out.print(mainJson);
            
            if (this.check.equals("true")){
            
            pedidoDAO.checker(pedidoVO.getID());
            
            }
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