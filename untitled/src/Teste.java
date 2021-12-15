import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a soma dos números:");
        int soma= ler.nextInt();

        System.out.println("Digite a diferença entre os números:");
        int dif= ler.nextInt();

        int num1=(dif+soma)/2;
        int num2=soma-num1;

        if(num1>num2){
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
