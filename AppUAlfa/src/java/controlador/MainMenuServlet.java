/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.CarritoDAO;
import dao.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import com.google.gson.*;
import org.json.JSONArray;

/**
 *
 * @author Carlos Alberto
 */
@WebServlet(name = "MainMenuServlet", urlPatterns = {"/MainMenuServlet"})
public class MainMenuServlet extends HttpServlet {
private CarritoDAO carritoDAO;
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
            throws ServletException, IOException, SQLException {
        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {
            
            


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
        try(PrintWriter out = response.getWriter()) {
            //processRequest(request, response);
            response.setContentType("application/json");
        
            CarritoDAO Mateo= new CarritoDAO();
            
            String P="";

            P = request.getParameter("opcion");
            

            
            if(P.equals("1")){
                //Envia Precio y cantidad
            String x= Mateo.Precio();
            String y=Mateo.Cantidad();
            JSONObject total = new JSONObject();
            JSONObject cant = new JSONObject();
            
            total.put("Total", x);
            cant.put("Cant", y);
            
            JSONArray arreglo = new JSONArray();
            
            arreglo.put(total);
            arreglo.put(cant);
            
            JSONObject fin = new JSONObject();
            fin.put("Arreglo",arreglo);
            out.print(fin);

            }
            
            
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
        try (PrintWriter out = response.getWriter()) {
            //processRequest(request, response);
            

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
