<%-- 
    Document   : DadosEmpresa
    Created on : 28 de jan de 2022, 02:38:51
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html ><body>
<form action="CadastroFC" method="post">
<input type="hidden" name="acao" value="incEmpExec"/>
Razão Social: <input type="text" name="razao_social"/><br/>
<input type="submit" value="Cadastrar"/>
</form>
</body></html>