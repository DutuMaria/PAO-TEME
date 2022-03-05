package exercitiul3;
import java.util.Scanner;

public class Exercitiul3 {

    static int factorial(int nr){
        if (nr == 0){
            return 1;
        } else if(nr == 1){
            return 1;
        } else {
            return nr * factorial(nr - 1);
        }
    }

    public static void main(String[] args) {

//        3. Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));
    }
}
