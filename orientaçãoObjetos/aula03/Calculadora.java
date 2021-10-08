
/**
 * Classe que representa o processamento aritmático
 * para operações simples - Calculadora Simples.
 * 
 * @author (Silvano A. Pereira) 
 * @version (1.0)
 */
public class Calculadora
{
    public static double executa(double n1, double n2, String operador) {
      double resultado = 0;
      switch (operador){
          case "+":
              resultado = n1 + n2;
              break;
          case "-":
              resultado = n1 - n2;
              break;
          case "*":
              resultado = n1 * n2;
              break;
          case "/":
              resultado = n1 / n2;
              break;
          default:
              resultado = 0.00;
              break;
      }
      return resultado;
    }
}
