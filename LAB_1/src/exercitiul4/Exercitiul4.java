package exercitiul4;
import java.util.Scanner;

public class Exercitiul4 {
    static int sumMultiplii(int nr){
        int s = 0;

        for (int i = 0; i <= nr; i++){
            if (i % 15 == 0){
                s += i;
            } else if(i % 5 == 0){
                s += i;
            } else if(i % 3 == 0){
                s += i;
            }
        }

//        for (int i = 0; i <= nr; i++){
//            if (i % 15 == 0 || i % 3 == 0 ||  i % 5 == 0){
//                s += i;
//            }
//        }

        return s;
    }

    public static void main(String[] args) {

//        4. Fiind dat un numar n, scrieti o metoda care insumeaza
//        toti multiplii de 3 si 5 pana la n (inclusiv).

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sumMultiplii(n));
    }
}
