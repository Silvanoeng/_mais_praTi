<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 05 exec</title>
</head>
<body>

   <h1>Exemplo 05 - processamento</h1>

   

    <%
    String env = request.getParameter("env");
    if (env != null) {
        String sn1 = request.getParameter("num1");
        String sn2 = request.getParameter("num2");
        try {
            int in1 = Integer.parseInt(sn1);
            int in2 = Integer.parseInt(sn2);
            if (in1 > in2) {
                int aux = in1;
                in1 = in2;
                in2 = aux;
            }

            for (int i=in1; i<=in2; i++) {
                if (i % 2 == 1) {
                    out.println(i + " - ");
                }
            }

        } catch (Exception e){
            out.print("Erro: " + e.getMessage());
        }
    } else {
        response.sendRedirect("exemplo05-form.jsp?redirecionamento=true");
    }
   
    %>


</body>
</html>