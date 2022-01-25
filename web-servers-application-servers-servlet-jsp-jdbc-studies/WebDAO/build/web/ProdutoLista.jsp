<%-- 
    Document   : ProdutoLista
    Created on : 25 de jan de 2022, 02:12:16
    Author     : pedro
--%>

<%@page import="model.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <a href="ServletProduto?acao=incluir">Incluir Produto</a>
        <table border="1" width="80%">
            <tr>
                <td>codigo</td> <td>nome</td>
                <td>quantidade</td><td>Opções</td>
<%
    ArrayList<Produto> lista = (ArrayList<Produto>)
                       request.getAttribute("listaProduto");
    for(Produto p: lista) {
%>
            <tr>
            <td><%=p.codigo%></td> 
            <td><%=p.nome%></td>
            <td><%=p.quantidade%></td>
            <td>
                <a href="ServletProduto?acao=excluirX&codigo=<%=p.codigo%>">
                excluir</a>
                            </td>            
            </tr>            
            </tr>
<%  } %>
        </table>
    </body>
</html>
