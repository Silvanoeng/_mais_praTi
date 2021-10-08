
/**
 * Classe auxiliar para exibição de janelas de diálogo.
 * 
 * @author (Silvano A. Pereira) 
 * @version (1.0)
 */
import javax.swing.*;
public class Tela
{
    /**
      * Método que exibe uma janela de diálofo para receber um texto,
     * converte ele para inteiro e depois retornar esse número.
     * @param (String)
     * @return (int)
     */
    public static int retornaValor(String texto) {
        // Usa o metodo JOptionPane.showInputDialog para abrir uma 
        //janela de dialogo, sempre vai retornar uma String.
        String dadoNumero = JOptionPane.showInputDialog(texto);
        
        //Converter a String em inteiro.
        int numero = Integer.parseInt(dadoNumero);
        
        //retorna o valor digitado na forma de inteiro.
        return numero;
    }
    
    /**
      * Método que exibe uma janela de diálofo para receber um texto,
     * converte ele para double e depois retornar esse número.
     * @param (String)
     * @return (double)
     */
    public static double retornaValorD(String texto) {
        // Usa o metodo JOptionPane.showInputDialog para abrir uma 
        //janela de dialogo, sempre vai retornar uma String.
        String dadoNumero = JOptionPane.showInputDialog(texto);
        
        //Converter a String em double.
        double numero = Double.parseDouble(dadoNumero);
        
        //retorna o valor digitado na forma de double.
        return numero;
    }
    
    /**
     * Método que exibe uma janela de diálofo para receber um texto e
     * retornar esse texto.
     * @param (String)
     * @return (String)
     */
    public static String retornaTexto(String texto) {
        // Usa o metodo JOptionPane.showInputDialog para abrir uma 
        //janela de dialogo, sempre vai retornar uma String.
        String dadoTexto = JOptionPane.showInputDialog(texto);
       
        //retorna o texto digitado.
        return dadoTexto;
    }

    /**
     * Método que exibe uma janela de diálofo para exibir um texto que
     * foi informado por parâmetro.
     * @param (String)
     */
    public static void mostraTexto(String texto) {
        // Usa o metodo showMessageDialog para abrir uma 
        //janela de dialogo.
        JOptionPane.showMessageDialog(null, texto);
    }
}
