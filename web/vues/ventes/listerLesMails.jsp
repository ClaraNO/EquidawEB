<%-- 
    Document   : listerLesMails
    Created on : 10 sept. 2020, 11:56:10
    Author     : sio2
--%>

<%@page import="modele.Mail"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des mails</title>
    </head>
    <body>
        <h1>LISTE DES MAILS </h1>
        
        <%
        ArrayList<Mail> lesMails = (ArrayList)request.getAttribute("pLesMails555");
        %>
        <table  class="table table-bordered table-striped table-condensed">
        
            <thead>
                <tr>             
                    
                    <th>id</th>
                    <th>date</th>
                    <th>objet</th>
                    <th>corps</th>
            <br>
            <br>
                </tr>
                
                <%
                    for(int i = 0; i < lesMails.size();i++)
                    {
                        Mail unMail = lesMails.get(i);
                        out.println("<td>");
                        out.println(unMail.getId());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unMail.getDate());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unMail.getObjet());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unMail.getCorps());
                        out.println("</td>");
                               
                    }
                    %>
            </thead>
        
    </body>
</html>
