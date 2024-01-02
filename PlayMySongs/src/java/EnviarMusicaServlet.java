/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 *
 * @author mateu
 */
@MultipartConfig
@WebServlet(name = "EnviarMusicaServlet" ,urlPatterns = {"/EnviarMusicaServlet"})
public class EnviarMusicaServlet extends HttpServlet {

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
        Part imagem = request.getPart("imagem");  
        String nomeimg= imagem.getSubmittedFileName();
       
        String ext  = nomeimg.replaceAll("^.*\\.(.*)$", "$1");
        Part musica = request.getPart("musica");  
        //String nomemusica = musica.getSubmittedFileName();
        String nomemusica = request.getParameter("nome");
        String cantor = request.getParameter("cantor");
        String genero = request.getParameter("genero");
        String nomearq = nomemusica+"_"+genero+"_"+cantor; 
        OutputStream out = null,outI = null;
        InputStream filecontent = null, filecontentI = null;
        PrintWriter writer = response.getWriter(), writerI = response.getWriter();
        try{
            File fpasta = new File(getServletContext().getRealPath("/") + "/Musicas");
            
            fpasta.mkdir();
            
            out = new FileOutputStream(new File(fpasta.getAbsolutePath() + "/" + nomearq+".mp3"));
            filecontent = musica.getInputStream();
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            out.close();
            filecontent.close();
           

            File fpastaI = new File(getServletContext().getRealPath("/") + "/Imagens");
            
            fpastaI.mkdir();
            
            outI = new FileOutputStream(new File(fpastaI.getAbsolutePath() + "/" + nomearq+"."+ext));
            
            
            filecontentI = imagem.getInputStream();
            int readI = 0;
            byte[] bytesI = new byte[1024];
            while ((readI = filecontentI.read(bytesI)) != -1) {
                outI.write(bytesI, 0, readI);
            }
            outI.close();
            filecontentI.close();
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request, response);
           
           
        }
        catch(Exception fne)
        {
            System.out.println(fne);
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
