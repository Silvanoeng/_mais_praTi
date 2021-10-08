
import javax.swing.*;
public class Teste
{
    public static void main(String args[]) {
        String coletaIdade;
        
        coletaIdade = JOptionPane.showInputDialog("Digite sua idade:");
        
        int idade = Integer.parseInt(coletaIdade);
        String mensagem = "";
        
        if (idade>17){
            mensagem = "Ok. Tudo certo, pode entrar.";
        
        } else {
            mensagem = "Não tem idade para entrar.";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
