/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.DTransaction;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASJoker76
 */
public class Hewan_Beli extends HttpServlet {

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
                String idtans = request.getParameter("idtrans");
                String idhewan = request.getParameter("idhewan");
                String idcustbeli = request.getParameter("idcustbeli");
                String idcustjual = request.getParameter("idcustjual");
                String tanggalpemesanan = request.getParameter("tanggalpemesanan");
                String total = request.getParameter("harga");
                String status = "Dalam Proses";
                String foto = request.getParameter("foto");

                DTransaction obj = new DTransaction();
                obj.setIdtrans(idtans);
                obj.setIdhewan(idhewan);
                obj.setIdcustbeli(idcustbeli);
                obj.setIdcustjual(idcustjual);
                obj.setTanggalPemesanan(tanggalpemesanan);
                obj.setTanggalPembayaran(null);
                obj.setTanggalPengiriman(null);
                obj.setTanggalTerima(null);
                obj.setTotal(Integer.parseInt(total));
                obj.setStatus(status);
                obj.setFoto(foto);
                
                int res = obj.Insert();

                if (res!=0)
                {
                    HttpSession session = request.getSession();
                    session.setAttribute("total",total);
                    response.sendRedirect("Bank_Info.jsp?message=inputsuccess");
                }
                else 
                {
                    response.sendRedirect("Bank_Info.jsp?message=inputfailed");
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
