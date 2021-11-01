<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 02</title>
</head>
<body>

   <h1>Exemplo 02 - Java Serve Pages</h1>
   <%
   //a estrutura básica do java permanece funcionando aqui
   //declaração de variáveis, tipos de dados, seleção, repetição, etc.
   int ini = 123;
   int fim = 231;
   int resultado = 0;

   for (int i=ini; i<=fim; i++){
       if (i % 2 == 0) {
           resultado=1;
       }
   }

   out.print("<h3>" + resultado + " é par.</h3>");
   %>


</body>
</html>