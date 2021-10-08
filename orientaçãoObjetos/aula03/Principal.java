
/**
 * Sistema que faz uma operação aritmática simples.
 * - Recebe dois números, um operador e mostra o resultado.
 * -CALCULADORA SIMPLES
 * 
 * @author (Silvano A. Pereira) 
 * @version (1.0)
 */
public class Principal
{
    /**
     * Método Principal
     */
    public static void main(String[] args) {
       double n1 = Tela.retornaValorD("Informe um valor:");
       double n2 = Tela.retornaValorD("Informe um valor:");
       String operador = Tela.retornaTexto("Operação: (+, -, *, /)");
       
       double resultado = Calculadora.executa(n1, n2, operador);
       
       Tela.mostraTexto("Resultado: "+ resultado);
    }
}
