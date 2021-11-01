<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 03</title>
</head>
<body>

   <h1>Exemplo 03 - Java Serve Pages</h1>

   - Testes enviando parâmetro para o servidor (GET / POST)
   <br><br>

   <%

   String sIdade = request.getParameter("idade");
   String msg = "";
   try {
   
        
        int iIdade = (int) Integer.parseInt(sIdade);

        if (iIdade>=18){
            msg = "Ok, tudo certo.";
        } else {
            msg = "Não pode entrar.";
        }
   } catch(NumberFormatException ne) {
       msg = ne.getMessage();
   } catch (Exception e) {
       msg = e.getMessage();
   }

   out.print(msg);

   %>


</body>
</html>