<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 05 form</title>
</head>
<body>

   <h1>Exemplo 05 - Formulario</h1>

   <form action="exemplo05-exe.jsp" method="post">
   Infome um número inteiro: <br>
   <input type="number" name="num1">
   <br><br>

   Infome outro número inteiro: <br>
   <input type="number" name="num2">
   <br><br>

    <button name="env">Calcular</button>

   </form>

   
    <%
    String sRedir = request.getParameter("redirecionamento");
    boolean bRedir = Boolean.parseBoolean(sRedir);


    if(bRedir){
        out.print("Você deve passar por essa pagina primeiro.");
    }
   
    %>


</body>
</html>