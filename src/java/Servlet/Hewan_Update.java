/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Hewan;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASJoker76
 */
public class Hewan_Update extends HttpServlet {

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
            try 
            {
                String idhewan = request.getParameter("idhewan");
                String idcust = request.getParameter("idcust");
                String nama = request.getParameter("namahewan");
                String berat = request.getParameter("berat");
                String umur = request.getParameter("umur");
                String harga = request.getParameter("harga");
                String type = request.getParameter("type");
                String status = request.getParameter("status");
                
                Hewan obj = new Hewan();
                obj.setIdhewan(idhewan);
                obj.setNamahewan(nama);
                obj.setBerat(Integer.parseInt(berat));
                obj.setUmur(Integer.parseInt(umur));
                obj.setHarga(Integer.parseInt(harga));
                obj.setType(type);
                obj.setStatus(status);
                int res = obj.Update();

                if (res!=0){
                    
                    response.sendRedirect("Hewan_Index?idcust="+idcust);
                }
                else {
                    response.sendRedirect("Hewan_Index?idcust="+idcust);
                }
            }
            catch (Exception e) 
            {
                
            }
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
        processRequest(request, response);
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
