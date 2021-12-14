<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 02</title>
</head>
<body>

<%

Statement stm = conn.createStatement();

String sql = "select * from noticias order by datahora desc";

ResultSet res = stm.executeQuery(sql);

while(res.next()) {

  Long idn = res.getLong("id");

  String tit = res.getString("titulo");

  String dat = res.getString("datahora");

  %>

	<h2> <%=tit%> </h2>

	<p> <%=dat%> </p>

	<a href="detalhes.jsp?n=<%=idn%>">+ detalhes</a>

  <%

}

%>

</body>
</html>


Questão 1/10
Marque a alternativa correta para o código a seguir:


<%

Statement stm = conn.createStatement();

String sql = "select * from noticias order by datahora desc";

ResultSet res = stm.executeQuery(sql);

while(res.next()) {

  Long idn = res.getLong("id");

  String tit = res.getString("titulo");

  String dat = res.getString("datahora");

  %>

	<h2> <%=tit%> </h2>

	<p> <%=dat%> </p>

	<a href="detalhes.jsp?n=<%=idn%>">+ detalhes</a>

  <%

}

%>


 <%-- Se ocorrer uma falha na consulta SQL será exibido um aviso através de um "alert()"
 Há um erro no link, não sendo possível direcionar para a página definida no "href"
 O código gerará erro de processamento, pois o laço de repetição não é finalizado
 Falta o caractere ";" nas instruções de exibição do título e datahora;
 O código exibirá uma lista de notícias (título, datahora e link) se houverem dados cadastrados na tabela --%>