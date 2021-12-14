

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
   int acumulador = 0;

for (int i=0; i<10; i++) {

	if ( (i % 3) == 0) {

		acumulador++;

 	}

}

out.print("Resultado = " + acumulador);
   %>


</body>
</html>