<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 04</title>
</head>
<body>

    
   <h1>Exemplo 04 - Recebe o codigo e faz processamento</h1>

   <%
    String scod = request.getParameter("codigo");
    boolean deuCerto = false;
    
    try{
        int icod = Integer.parseInt(scod);
        if (icod == 123) {
            deuCerto = true;
        }
    } catch(Exception e){
        out.print("Problemas de acesso: " + e.getMessage());
    }

    if (deuCerto) {
        out.print("Seja bem vindo(a).");
    } else {
        String voltar = "<a href = 'exemplo04-link.jsp?bug=true'>Voltar</a>";
        out.print(voltar);
    }

   %>

</body>
</html>