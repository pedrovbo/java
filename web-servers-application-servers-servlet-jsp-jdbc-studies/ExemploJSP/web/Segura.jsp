<%-- 
    Document   : Segura
    Created on : 25 de jan de 2022, 00:09:47
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   if(session.getAttribute("usuario")==null)
      response.sendRedirect("Login.jsp");
   else {
%>
<!DOCTYPE html>
<html>
   <body>
      <h1>Esta é uma página protegida!</h1>
      O usuário <%=session.getAttribute("usuario")%>
      está logado.<br/>
      <form action="ServletLogin1" method="post">
      <input type="hidden" name="acao" value="desconectar"/>
      <input type="submit" value="logout"/>
      </form>
   </body>
</html>
<% } %>
