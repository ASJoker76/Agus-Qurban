/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Hewan;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author ASJoker76
 */
public class Hewan_Insert extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            try
            {
                String idhewan = null;
                String idcust = null;
                String nama = null;
                String berat = null;
                String umur = null;
                String harga = null;
                String type = null;
                String status = null;
                String foto = null;
                String message;
                if(ServletFileUpload.isMultipartContent(request)) 
                {
                    try 
                    {
                        List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                        for(FileItem item : multiparts)
                        {
                            if(!item.isFormField())
                            {
                            // ganti kode url di bawah dengan path di masing-masing komputer anda
                            String url = "D:\\JSP\\IAQurban\\web\\Uploads\\";
                            foto = new File(item.getName()).getName();
                            item.write(new File(url + File.separator + foto));
                            }
                            else 
                            {
                                String fieldname = item.getFieldName();
                                String fieldvalue = item.getString();
                                if (fieldname.equals("idhewan")) 
                                {
                                    idhewan = fieldvalue;
                                }
                                else if (fieldname.equals("idcust")) 
                                {
                                    idcust = fieldvalue;
                                }
                                else if (fieldname.equals("namahewan")) 
                                {
                                    nama = fieldvalue;
                                } 
                                else if (fieldname.equals("berat")) 
                                {
                                    berat = fieldvalue;
                                }
                                else if (fieldname.equals("umur")) 
                                {
                                    umur = fieldvalue;
                                }
                                else if (fieldname.equals("harga")) 
                                {
                                    harga = fieldvalue;
                                }
                                else if (fieldname.equals("type")) 
                                {
                                    type = fieldvalue;
                                }
                                else if (fieldname.equals("status")) 
                                {
                                    status = fieldvalue;
                                }
                            }
                        }
                        Hewan obj = new Hewan();
                        obj.setIdhewan(idhewan);
                        obj.setIdcust(idcust);
                        obj.setNamahewan(nama);
                        obj.setBerat(Integer.parseInt(berat));
                        obj.setUmur(Integer.parseInt(umur));
                        obj.setHarga(Integer.parseInt(harga));
                        obj.setType(type);
                        obj.setStatus(status);
                        obj.setFoto(foto);
                        int res = obj.Insert();
                        if (res!=0) 
                        {
                            message = "success";
                        } 
                        else 
                        {
                            message = "failed";
                        }
                }
                catch (Exception ex) 
                {
                    message = "failed";
                }
            } 
            else 
            {
                message = "failed";
            }
            response.sendRedirect("Hewan_Index?idcust="+idcust);
        }
        catch (Exception e) 
        {
            System.err.println(e);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Hewan_Insert.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Hewan_Insert.class.getName()).log(Level.SEVERE, null, ex);
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
