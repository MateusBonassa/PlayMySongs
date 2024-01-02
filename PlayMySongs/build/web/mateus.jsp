


<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
            File pastaimgs= new File(getServletContext().getRealPath("/") + "Imagens");
            
            String[] imgnomes = pastaimgs.list();
            File pasta = new File(getServletContext().getRealPath("/") + "Musicas");
            
            int pos;
           String aux;
            
            String [] mscnomes = pasta.list();
            for (String s : mscnomes) {
                aux = s.substring(0, s.length()-4);
                pos = aux.indexOf("_");
                aux = aux.substring(0, pos);
                %>
                <div>
                    <p><%= aux%></p>
                    <img  src="<%="Imagens/"+AcharImg(aux,imgnomes)%>" height="70px" width="70px"/>
                    <audio controls>
                        <source src="<%="Musicas/"+s%>" type="audio/mpeg">
                    </audio>
                </div><br>
           <% }%>
    </center>

    </body>
</html>
