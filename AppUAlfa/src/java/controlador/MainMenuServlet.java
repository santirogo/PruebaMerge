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
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import vo.ProductoVO;

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
        try (PrintWriter out = response.getWriter()) {
            //processRequest(request, response);
            response.setContentType("application/json");

            CarritoDAO Mateo = new CarritoDAO();
            HttpSession sesion = request.getSession();
            ArrayList<ProductoVO> CarroSesion = (ArrayList) sesion.getAttribute("carrito");

            String P = "";

            P = request.getParameter("opcion");

            if (P.equals("1")) {

                ProductoVO productos = new ProductoVO();
                ArrayList<ProductoVO> Arreglo = new ArrayList();

                JSONArray array = new JSONArray();
                

                //Arreglo= Mateo.infoCheckOut();
                Arreglo = CarroSesion;
                if (Arreglo == null) {
                    System.out.println("paila, esta nulo");

                } else if (Arreglo != null) {
                    for (int i = 0; i < Arreglo.size(); i++) {
                        JSONObject json = new JSONObject();
                        productos = (ProductoVO) Arreglo.get(i);
                        json.put("ID", productos.getID());
                        json.put("nombre", productos.getNombre());
                        json.put("cantidad", String.valueOf(productos.getCantidad()));
                        json.put("precio", String.valueOf(productos.getPrecio()));
                        array.put(json);

                    }

                    //Envia Precio y cantidad
                    String x = Mateo.PrecioTotal(CarroSesion);
                    JSONObject total = new JSONObject();

                    total.put("Total", x);

                    array.put(total);

                    JSONObject fin = new JSONObject();
                    fin.put("Productos", array);
                    out.print(fin);

                }
            }

            if (P.equals("2")) {
                ArrayList<ProductoVO> Arreglo = new ArrayList();

                Arreglo = CarroSesion;
                String ID = request.getParameter("idprod");

                Mateo.borrar(ID, Arreglo);

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
