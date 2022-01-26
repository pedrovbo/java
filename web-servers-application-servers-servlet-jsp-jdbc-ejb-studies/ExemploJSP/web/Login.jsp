<%-- 
    Document   : Login
    Created on : 25 de jan de 2022, 00:09:28
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <body>
      <h1>Acesso ao Sistema</h1>
      <form action="ServletLogin1" method="post">
         <input type="hidden" name="acao" value="conectar"/>
         Login: <input type="text" name="login"/>
         Senha: <input type="password" name="senha"/>
         <input type="submit" value="login"/>
      </form>
<%
   if(request.getAttribute("erro")!=null) {
%>
      <hr/>Ocorreu um erro: <%=request.getAttribute("erro")%>   
<%
   }
%>
    </body>
</html>
