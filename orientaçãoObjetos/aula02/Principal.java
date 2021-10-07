

public class Principal
{
   public static void main (String args[]){
       Caneta bic = new Caneta("azul",0.7,70);
       
       bic.escrever("Estamos realizando um teste.");
       
       bic.verificarNivelDeTinta();
       
       bic.recarregarTinta();
       
   }
}
