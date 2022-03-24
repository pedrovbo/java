<%-- 
    Document   : index
    Created on : 30 de jan de 2022, 18:42:05
    Author     : pedro
--%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		Consumindo Web Services SOAP
	</head>
	<body>
		<form name="Test" method="post" action="DisciplinaWSServlet">
			Listando os Temas Existentes:
			<br/>
			<input name="service_name" value="listar_temas" type="hidden" id="service_name"/>
			<input type="submit" value="Somar" name="calculadorabutton">
			<br/>
			<p>Listando os Módulos de acordo com o Tema Informado:</p>
			<br/>
			<input name="tema_nome" id="tema_nome"/>
			<br/>
			<input type="submit" value="Listar Temas" name="formButton">
		</form>
		<br/>
		<form name="Test" method="post" action="DisciplinaWSServlet">
			<h1>Listando os Módulos de acordo com o Tema Informado:</h1>
			<br/>
			<input name="tema_nome" id="tema_nome"/>
			<input name="service_name" value="listar_modulos" type="hidden" id="service_name"/>
			<br/>
			<input type="submit" value="Listar Módulos" name="formButton">
		</form>
	</body>
	</html>