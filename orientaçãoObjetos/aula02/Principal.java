

public class Principal
{
   public static void main (String args[]){
       /*
       Caneta bic = new Caneta("azul",0.7,70);
       
       bic.escrever("Estamos realizando um teste.");
       
       bic.verificarNivelDeTinta();
       
       bic.recarregarTinta();
       
       
       Monitor dell = new Monitor(1024, "d17hb");
       dell.ligar();
       dell.ligar();
       dell.informacoesDoMonitor();
       dell.ajustarResolucao(1100);
       dell.ajustarResolucao(1600);
       dell.informacoesDoMonitor();
       dell.desligar();
       */
    
       String texto1 = "0123456789 10 11 12 13 teste";
       
       System.out.println(texto1.toUpperCase() );
       System.out.println(texto1.substring(2,8) );
       System.out.println(texto1.charAt(9) );
       String[] vetor = texto1.split(" ");
       System.out.println(vetor[3] );
   }
}
