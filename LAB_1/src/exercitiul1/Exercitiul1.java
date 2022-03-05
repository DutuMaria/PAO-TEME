package exercitiul1;
import java.util.Scanner;

public class Exercitiul1 {
    public static void main(String[] args) {

//        1. Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n],
//        unde n este un numar citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
