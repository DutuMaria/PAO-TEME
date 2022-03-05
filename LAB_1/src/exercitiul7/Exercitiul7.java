package exercitiul7;
import java.util.Scanner;

public class Exercitiul7 {

    static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1 || n == 2){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n -2);
        }
    }

    public static void main(String[] args) {

//        7. Sa se afiseze al n-lea termen din seria Fibonacci, unde n este citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0){
            System.out.println("Incorect input!");
        } else {
            System.out.println(fibonacci(n));
        }
    }
}
