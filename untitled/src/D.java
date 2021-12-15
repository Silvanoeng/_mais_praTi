import java.io.PrintStream;
import java.util.Scanner;

public class D {
    public static int computeClosestToZero(int[] ts, int desc) {

        int valor= 0;
        int soma= 0;
        double desconto= 0;

        for (int i=0; i<ts.length; i++){
            if(i==0){
                valor=ts[i];
            }else {
                if(valor<ts[i]){
                    valor=ts[i];
                }
            }
            soma+=ts[i];
        }
        desconto=((valor*desc)/100);
        soma= soma-(int)desconto;
        return soma;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int desc = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }

        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts, desc);
        System.setOut(outStream);
        System.out.println(solution);
    }
}
