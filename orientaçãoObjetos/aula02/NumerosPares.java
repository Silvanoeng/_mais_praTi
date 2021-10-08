
import javax.swing.*;
public class NumerosPares
{
   public static void main(String args[]){
       String dadoInicio = JOptionPane.showInputDialog("Inicio");
       String dadoFinal = JOptionPane.showInputDialog("Final");
       int inicio = Integer.parseInt(dadoInicio);
       
       int fim = Integer.parseInt(dadoFinal);
       
       int soma = 0;
       int cont = 0;
       String resultado = "";
       for (int i=inicio; i<=fim; i++) {
           if (i % 2 == 0) {
               resultado = resultado + i + " - ";
               cont++;
               soma += i;
           }
       }
       
       JOptionPane.showMessageDialog(null, resultado);
       JOptionPane.showMessageDialog(null, "Quantidade: "+cont);
       JOptionPane.showMessageDialog(null, "Soma: "+soma);
   }
   
}
