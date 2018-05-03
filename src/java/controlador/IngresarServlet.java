/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Mascota;
import beans.ServicioLocal;

/**
 *
 * @author Informatica
 */
@WebServlet(name = "IngresarServlet", urlPatterns = {"/control.do"})
public class IngresarServlet extends HttpServlet {
    
    @EJB
    private ServicioLocal servicio;



    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre=request.getParameter("nombre");
        String especie=request.getParameter("especie");
        String raza=request.getParameter("raza");
        String sexo=request.getParameter("sexo");
        String edadStr=request.getParameter("edad");
        int edad=0;
        String fechanac=request.getParameter("fecha de nacimiento");
        String idmasStr=request.getParameter("id");
        int idmas=0;
        
        try{
            edad=Integer.valueOf(edadStr);
            idmas=Integer.valueOf(idmasStr);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

        servicio.addMascota(new Mascota(nombre,especie,raza,sexo,edad,fechanac,idmas));
        response.sendRedirect("index.jsp");
            
            
        
        
        
        
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
