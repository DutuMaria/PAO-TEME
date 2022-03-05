package exercitiul6;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercitiul6 {
    public static void main(String[] args) {

//        6. Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea
//        notelor se opreste si programul afiseaza media acestora.

        Scanner scanner = new Scanner(System.in);
//        double nr = scanner.nextDouble();
//        ArrayList<Double> vNr = new ArrayList<Double>();
//
//        while(nr != -1){
//            vNr.add(nr);
//            nr = scanner.nextDouble();
//        }
//
//        System.out.println(vNr.stream().mapToDouble(Double::doubleValue).sum() / vNr.size());

        int nr = scanner.nextInt();
        double sum = 0;

        ArrayList<Integer> vNr = new ArrayList<Integer>();

        while(nr != -1){
            vNr.add(nr);
            sum += nr;
            nr = scanner.nextInt();
        }

        System.out.println(sum / vNr.size());
    }
}


