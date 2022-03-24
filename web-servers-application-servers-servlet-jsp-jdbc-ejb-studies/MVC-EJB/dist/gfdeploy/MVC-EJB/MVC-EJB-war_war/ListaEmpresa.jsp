<%-- 
    Document   : ListaEmpresa
    Created on : 28 de jan de 2022, 02:46:00
    Author     : pedro
--%>

<%@page import="model.Empresa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<body>
<a href="CadastroFC?acao=incEmp">Nova Empresa</a>
<table border="1" width="100%">
<tr><td>Código</td><td>Razão Social</td><td>Opções</td></tr>
<%
List<Empresa> lista = (List<Empresa>)
request.getAttribute("lista");
for(Empresa e: lista){
%>
<tr><td><%=e.getCodigo()%></td>
<td><%=e.getRazaoSocial()%></td>
<td>
<a href="CadastroFC?acao=excEmpExec&cod=<%=e.getCodigo()%>">
Excluir</a>
</td>
</tr>
<% } %>
</table>
</body>
</html>