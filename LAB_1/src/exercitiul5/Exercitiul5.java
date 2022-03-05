package exercitiul5;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercitiul5 {
    public static void main(String[] args) {

//        5. Cititi de la tastatura n numere. Elementele citite vor fi organizate
//        in doi vectori diferiti, in functie de
//        paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int pare[] = new int[n];
//        int impare[] = new int[n];
//
//        int cntPare = 0, cntImpare = 0;
//
//
//        for (int i = 0; i < n; i++){
//            int x = scanner.nextInt();
//            if (x % 2 == 0){
//                pare[cntPare] = x;
//                cntPare++;
//            } else{
//                impare[cntImpare] = x;
//                cntImpare++;
//            }
//        }
//
//        for (int i = 0; i < cntPare; i++){
//            System.out.print(pare[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < cntImpare; i++){
//            System.out.print(impare[i] + " ");
//        }

        ArrayList<Integer> pare = new ArrayList<Integer>();
        ArrayList<Integer> impare = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            int x = scanner.nextInt();
            if (x % 2 == 0){
               pare.add(x);
            } else{
                impare.add(x);
            }
        }

        for (int i = 0; i < pare.size(); i++){
            System.out.print(pare.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < impare.size(); i++){
            System.out.print(impare.get(i) + " ");
        }
    }
}
