import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        int n=11;
        int soma=0;

        for (int i=1; i<=n; i++){

            if(i%3==0 || i%5==0 || i%7==0 ){
                soma+=i;
            }
        }
        System.out.println(soma);
    }
}
