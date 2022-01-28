<%-- 
    Document   : DadosDepartamento
    Created on : 28 de jan de 2022, 02:43:32
    Author     : pedro
--%>

<%@page import="model.Empresa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<body>
<form action="CadastroFC" method="post">
<input type="hidden" name="acao" value="incDepExec"/>
Empresa:
<select name="cod_empresa">
<%
List<Empresa> lista = (List<Empresa>)
request.getAttribute("listaEmp");
for(Empresa e: lista){
%>
<option value="<%=e.getCodigo()%>">
<%=e.getRazaoSocial()%>
</option>
<% } %>
</select >< br/ >
Nome: <input type="text" name="nome"/ >

<input type="submit" value="Cadastrar"/ >
</form >
</body >
</html >