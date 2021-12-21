public class Main {
    public static void main(String[] args) {
        for (int i=1; i<101; i++){
            processar(i);
        }
    }

    private static void processar(int i) {
        if(i %3==0 && i %5==0 ){
            System.out.println("Fizz Buzz");
        }else if ((i %3 == 0) || (i %5 == 0)){
            if (i %3 == 0) {
                System.out.println("Fizz");
            }
            if (i %5 == 0) {
                System.out.println("Buzz");
            }

        } else {
            System.out.println(i);
        }
    }
}
