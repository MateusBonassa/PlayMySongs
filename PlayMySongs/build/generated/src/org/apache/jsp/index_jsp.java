package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


 

    public  String AcharImg(String nome, String[] lista)
    {

        String achou="";
        for(int i=0;i<lista.length;i++)
        {
            if(lista[i].contains(nome))
            {
               achou = lista[i];
               i = lista.length;
            }
                
        }
        return achou;
    }


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    String nomeMusic = request.getParameter("nomeMusic");
    

      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Fredoka:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            .central{\n");
      out.write("                margin: 0 auto;\n");
      out.write("                width: 50%;\n");
      out.write("                height: auto;\n");
      out.write("                background-color: #2e2e2e; \n");
      out.write("                padding: 0px;\n");
      out.write("                padding-bottom: 60px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                border-radius: 30px; \n");
      out.write("                box-shadow: 5px 10px 20px 10px #FC80B8;\n");
      out.write("                margin-top: 3%;\n");
      out.write("                border: solid #202020 5px;\n");
      out.write("                margin-bottom: 3%;\n");
      out.write("            }\n");
      out.write("            .searchMusic{\n");
      out.write("                border: solid #FC80B8 2px;\n");
      out.write("                background-color: #2e2e2e;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                width: 180px;\n");
      out.write("                outline: none;\n");
      out.write("                transition: 0.35s;\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                color: white;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .searchMusic:hover{\n");
      out.write("                width: 220px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                box-shadow: 5px 5px 50px 2px #FC80B8;\n");
      out.write("            }\n");
      out.write("            .searchMusic:focus{\n");
      out.write("                width: 220px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                box-shadow: 5px 5px 50px 2px #FC80B8;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .itemMusica{\n");
      out.write("                width: 165px;\n");
      out.write("                height: 140px;\n");
      out.write("                margin-left: 40px;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                transition: 0.4s;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                padding: 10px;\n");
      out.write("            } \n");
      out.write("            \n");
      out.write("            .itemMusica:hover{\n");
      out.write("                cursor:pointer;\n");
      out.write("                box-shadow: 1px 1px 10px 1px black;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .musicas{\n");
      out.write("                display: flex;\n");
      out.write("                margin-top: 50px;\n");
      out.write("\n");
      out.write("                \n");
      out.write("            } \n");
      out.write("            .add{\n");
      out.write("                width: 70px;\n");
      out.write("                color: white;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .addtexto{\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: white;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                font-family: 'Fredoka', sans-serif;    \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .logo{\n");
      out.write("                text-align:center;\n");
      out.write("                color: #FC80B8;\n");
      out.write("                font-family: 'Fredoka', sans-serif;    \n");
      out.write("                font-size: 30px\n");
      out.write("            }\n");
      out.write("            .flex-wrap-music {\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .imgMusic{\n");
      out.write("                width:60%;\n");
      out.write("                height: 75%;\n");
      out.write("                box-shadow: 1px 1px 20px 1px black;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .modal-content{\n");
      out.write("                background-color: #2e2e2e; \n");
      out.write("                border-radius: 30px;\n");
      out.write("                box-shadow:  1px 1px 20px 1px black;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .modal-dialog{\n");
      out.write("                transition: 0.4s;       \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-title{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .close{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .imgMusicModal{\n");
      out.write("                width: 70%;\n");
      out.write("                height: 75%;\n");
      out.write("                margin-bottom: 5%;\n");
      out.write("                border-radius: 10px\n");
      out.write("            }\n");
      out.write("            audio {\n");
      out.write("                width: 75%;\n");
      out.write("                height: 40px;\n");
      out.write("                background-color: #2e2e2e; \n");
      out.write("            }\n");
      out.write("            audio::-webkit-media-controls-panel, video::-webkit-media-controls-panel {\n");
      out.write("                background-color: #F380C8; \n");
      out.write("            }   \n");
      out.write("            form p{color:white;}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script> \n");
      out.write("            function PausarMusica(idMusic){\n");
      out.write("                var x = document.getElementById(\"idMusic\"+idMusic);\n");
      out.write("                console.log();\n");
      out.write("                x.pause();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function validaImg(img)\n");
      out.write("            {\n");
      out.write("                var imgex = /(.jpg|.jpeg|.png)$/i;\n");
      out.write("                if(!imgex.exec(img.value))\n");
      out.write("                    img.value = null;\n");
      out.write("            }\n");
      out.write("            function validaMsc(msc)\n");
      out.write("            {\n");
      out.write("                var mscex = /(.mp3)$/i;\n");
      out.write("                if(!mscex.exec(msc.value))\n");
      out.write("                    msc.value = null;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div class=\"central\">\n");
      out.write("            <div\n");
      out.write("            <div>\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <p>MP3-FERRO</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <form  action=\"index.jsp\" >\n");
      out.write("                        <input class=\"searchMusic\"  name=\"nomeMusic\"  value=\"\" placeholder=\"Digite para pesquisar..\" autocomplete=\"off\" type=\"text\" id=\"search\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"musicas flex-wrap-music\" >\n");
      out.write("                <div class=\"itemMusica\" data-toggle=\"modal\" data-target=\"#modalForm\">\n");
      out.write("                    <img src=\"IconAdd.png\" class=\"add\">\n");
      out.write("                    <p class=\"addtexto\">Adicionar Música</p>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"modal fade\" id=\"modalForm\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                  <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">Enviar uma Musica</h4>\n");
      out.write("                      \n");
      out.write("                      <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                      <div class=\"modal-body\" >\n");
      out.write("                          <form method=\"POST\" action=\"EnviarMusicaServlet\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                              <p>Digite o nome da musica:</p><input type=\"text\" name=\"nome\" id=\"nome\" pattern =\"[a-zA-Z0-9_ ]+\" placeholder=\"Digite o nome da música...\" required><br>\n");
      out.write("                              <p>Digite o nome do cantor:</p><input type=\"text\" name=\"cantor\" id=\"cantor\" pattern =\"[a-zA-Z0-9_ ]+\" placeholder=\"Digite o nome do cantor...\" required><br>\n");
      out.write("                              <p>Digite o nome do genero:</p><input type=\"text\"  name=\"genero\" id=\"genero\" pattern =\"[a-zA-Z0-9_ ]+\" placeholder=\"Digite o genero da musica...\" required><br>\n");
      out.write("                              <p>Insira a imagem (jpg/png/jpeg):</p><input type=\"file\" name=\"imagem\" id=\"imagem\" accept=\".jpg,.jpeg,.png\"  onchange=\"validaImg(this)\" required/> <br>\n");
      out.write("                              <p>Insira a musica (mp3):</p><input type=\"file\" name=\"musica\" id=\"musica\" accept=\".mp3\" onchange=\"validaMsc(this)\" required/><br><br>\n");
      out.write("                              <input type=\"submit\" name=\"Enviar\" value=\"Enviar\" >    \n");
      out.write("\n");
      out.write("\n");
      out.write("                          </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                ");

            File pastaimgs= new File(getServletContext().getRealPath("/") + "Imagens");
            
            String[] imgnomes = pastaimgs.list();
            File pasta = new File(getServletContext().getRealPath("/") + "Musicas");
            int idMusic = 0;
            int pos;
            
            String aux,partes[];
            String aux_da_aux;
            String [] mscnomes = pasta.list();
            for (String s : mscnomes) {
                aux = s.substring(0, s.length()-4);
                partes = aux.split("_");
                //pos = aux.indexOf("_");
                //aux = aux.substring(0, pos);
                aux = partes[0];
                aux_da_aux = aux.toLowerCase();
              
                if(nomeMusic == null || aux_da_aux.contains(nomeMusic.toLowerCase())){
                
      out.write("\n");
      out.write("                <div class=\"itemMusica\" data-toggle=\"modal\" data-target=\"#modal");
      out.print( idMusic);
      out.write("\">\n");
      out.write("                    <img class=\"imgMusic\" src=\"");
      out.print("Imagens/"+AcharImg(aux,imgnomes));
      out.write("\"   class=\"add\">\n");
      out.write("                    <p class=\"addtexto\">");
      out.print( aux);
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div class=\"modal fade\" id=\"modal");
      out.print( idMusic);
      out.write("\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                  <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <!-- Modal Header -->\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">");
      out.print( aux+" by "+partes[2]);
      out.write("<br><i>");
      out.print(partes[1]);
      out.write("</i></h4>\n");
      out.write("                      \n");
      out.write("                      <button type=\"button\" class=\"close\" onClick=\"PausarMusica(");
      out.print(idMusic);
      out.write(" )\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Modal body -->\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div>\n");
      out.write("                            <img src=\"");
      out.print("Imagens/"+AcharImg(aux,imgnomes));
      out.write("\" class=\"imgMusicModal\">\n");
      out.write("                        </div>\n");
      out.write("                      <audio  controls class=\"playerAudio\" id=\"idMusic");
      out.print(idMusic);
      out.write("\" >\n");
      out.write("                        <source src=\"");
      out.print("Musicas/"+s);
      out.write("\" type=\"audio/mpeg\">\n");
      out.write("                      </audio>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("               ");
 idMusic++;}}
      out.write("\n");
      out.write("                    \n");
      out.write("             \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
