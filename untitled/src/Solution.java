import java.util.*;
import java.io.*;

class Solution {

    public static int computeClosestToZero(int[] ts) {
        if(ts==null){
            return 0;
        }
        int valor= 0;
        int valor1= 0;
        int valor2=0;
        for (int i=0; i<ts.length; i++){
            if(ts[i]==0){
                return 0;
            }
            if(i==0){
                valor=ts[i];
                valor1=Math.abs(valor);
                valor2=valor1*(-1);
            }else {
                if(valor1>ts[i] && ts[i]>valor2){
                    valor=ts[i];
                    valor1=Math.abs(valor);
                    valor2=valor1*(-1);
                }else if(valor1 == ts[i] || valor2== ts[i]){
                    if (valor<ts[i]){
                        valor=ts[i];
                        valor1=Math.abs(valor);
                        valor2=valor1*(-1);
                    }
                }
            }
        }
        return valor;
    }



    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
    }
    // #endregion
}
