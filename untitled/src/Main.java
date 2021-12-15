public class Main {
    public static void main(String[] args) {
        for (int n = 0; n<16; n++){
            int div3 = n % 3;
            int div5 = n % 5;

            if (div3==0 && div5==0) {
                System.out.println("FizzBuzz");
            } else if (div3==0) {
                System.out.println("Fizz");
            } else if (div5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }

}
