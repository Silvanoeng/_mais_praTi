<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 04 (exec)</title>
</head>
<body>

   <h1>Exemplo 04 - Java Serve Pages (Teste com link)</h1>

   Ao clicar no link vai para a pagina de processamento.
   <br><br>

    <a href="exemplo04-exec.jsp?codigo=123">
        Clique aqui para fazer o processamento
    </a>
    <br><br>

    <%
    String bug = request.getParameter("bug");
    if (bug != null){
        if (bug.equals("true")) {
            out.print(bug);
        }
    }
    %>


</body>
</html>