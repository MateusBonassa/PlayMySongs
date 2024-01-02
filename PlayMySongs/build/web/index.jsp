<%-- 
    Document   : index
    Created on : 07/03/2022, 21:52:45
    Author     : Aluno
--%>


<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nomeMusic = request.getParameter("nomeMusic");
    
%>
<%!
 

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

%>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Fredoka:wght@300&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <title>MP3-FERRO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style.css">
        
        <script> 
            function PausarMusica(idMusic){
                var x = document.getElementById("idMusic"+idMusic);
                console.log();
                x.pause();

            }
            
            
            function validaImg(img)
            {
                var imgex = /(.jpg|.jpeg|.png)$/i;
                if(!imgex.exec(img.value))
                    img.value = null;
            }
            function validaMsc(msc)
            {
                var mscex = /(.mp3)$/i;
                if(!mscex.exec(msc.value))
                    msc.value = null;
            }
        </script>
        
    </head>
    <body >
        <div class="central">
            <div
            <div>
                <div class="logo">
                    <p>MP3-FERRO</p>
                </div>

                <div>
                    <form  action="index.jsp" >
                        <input class="searchMusic"  name="nomeMusic"  value="" placeholder="Digite para pesquisar.." autocomplete="off" type="text" id="search">
                    </form>
                </div>
            </div>
            <div class="musicas flex-wrap-music" >
                <div class="itemMusica" data-toggle="modal" data-target="#modalForm">
                    <img src="IconAdd.png" class="add">
                    <p class="addtexto">Adicionar</p>
                    <p class="addtexto">Música</p>
                </div>
            <div class="modal fade" id="modalForm">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Enviar uma Musica</h4>
                      
                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                      <div class="modal-body" >
                          <form method="POST" action="EnviarMusicaServlet" enctype="multipart/form-data">

                              <p class="inputText">Nome da Música</p><input class="inputAdd" type="text" name="nome" id="nome" pattern ="[a-zA-Z0-9_ ]+" placeholder="Nome da Música..." required><br>
                              <p class="inputText">Nome do Cantor</p><input class="inputAdd" type="text" name="cantor" id="cantor" pattern ="[a-zA-Z0-9_ ]+" placeholder="Nome do cantor..." required><br>
                              <p class="inputText">Gênero da Música</p><input class="inputAdd" type="text"  name="genero" id="genero" pattern ="[a-zA-Z0-9_ ]+" placeholder="Gênero da Música..." required><br>
                              <p class="inputText">Insira a Imagem (jpg/png/jpeg):</p><input class="btnFile" type="file" name="imagem" id="imagem" accept=".jpg,.jpeg,.png"  onchange="validaImg(this)" required/> <br>
                              <p class="inputText">Insira a Música (mp3):</p><input class="btnFile" style="margin-botton:5px;" type="file" name="musica" id="musica" accept=".mp3" onchange="validaMsc(this)" required/><br><br>
                              <input class="btnMusica" type="submit" name="Enviar" value="Enviar" >    


                          </form>
                    </div>


                  </div>
                </div>
              </div>
                <%
            File pastaimgs= new File(getServletContext().getRealPath("/") + "Imagens");
            
            String[] imgnomes = pastaimgs.list();
            File pasta = new File(getServletContext().getRealPath("/") + "Musicas");
            int idMusic = 0;
            int pos;
            
            String aux,partes[];
            String aux_da_aux;
            String TipoMusica;

            String [] mscnomes = pasta.list();
            for (String s : mscnomes) {
                aux = s.substring(0, s.length()-4);
                partes = aux.split("_");
                //pos = aux.indexOf("_");
                //aux = aux.substring(0, pos);
                aux = partes[0];
                aux_da_aux = aux.toLowerCase();
                TipoMusica = partes[1].toLowerCase();
              
                if(nomeMusic == null || aux_da_aux.contains(nomeMusic.toLowerCase()) || TipoMusica.contains(nomeMusic.toLowerCase()) ){
                %>
                <div class="itemMusica" data-toggle="modal" data-target="#modal<%= idMusic%>">
                    <img class="imgMusic" src="<%="Imagens/"+AcharImg(aux,imgnomes)%>"   class="add">
                    <p class="addtexto"><%= aux%></p>
                </div>
                
            <div class="modal fade" id="modal<%= idMusic%>">
                <div class="modal-dialog">
                  <div class="modal-content">

                    <!-- Modal Header -->
                    <div class="modal-header">
                        <a style="text-align: left; margin-bottom: 0;" target="_blank" href="https://www.google.com/search?q=Letra+m%C3%BAsica+<%= aux.replace(" ", "+") %>" >
                            <p class="modal-title"   ><%= aux%></p>
                        <p class="CantorMusic"><%= partes[2]+" - "+ partes[1]%> </p>
                        </a>
                      <button type="button" class="close" onClick="PausarMusica(<%=idMusic%> )" data-dismiss="modal">&times;</button>
                    </div>

                    <!-- Modal body -->
                    <div class="modal-body">
                        <div>
                            <img src="<%="Imagens/"+AcharImg(aux,imgnomes)%>" class="imgMusicModal">
                        </div>
                      <audio  controls class="playerAudio" id="idMusic<%=idMusic%>" >
                        <source src="<%="Musicas/"+s%>" type="audio/mpeg">
                      </audio>
                    </div>



                  </div>
                </div>
              </div>
                
                
               <% idMusic++;}}%>
                    
             
                
            </div>
        </div>
    </body>
</html>