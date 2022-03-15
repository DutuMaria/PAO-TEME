package shop;

import area.Area;
import candyBag.CandyBag;
import candyBox.CandyBox;
import candyBox.Lindt;
import candyBox.Merci;
import candyBox.Milka;

public class Shop {
    public static void main(String[] args) {
        Milka milka1 = new Milka("vanilie", "origine1", 2, 5);
        Milka milka2 = new Milka("vanilie", "origine1", 2, 5);
        Lindt lindt1 = new Lindt("capsuni", "origine3", 7, 4, 5);
        Merci merci1 = new Merci("fistic", "origine2", 6);
        Merci merci2 = new Merci("fistic", "origine2", 12);

        System.out.println(milka1.equals(milka2));
        System.out.println(lindt1.equals(milka2));
        System.out.println(merci1.equals(merci2));
        System.out.println();

        CandyBox[] candyBoxes1 = {milka1, milka1, milka1};
        CandyBox[] candyBoxes2 = {milka1, lindt1, merci1};

//        for (var box: candyBoxes1){
//            System.out.println(box.toString());
//        }

        CandyBag candyBag1 = new CandyBag(candyBoxes1);
        CandyBag candyBag2 = new CandyBag(candyBoxes2);

        Area area1 = new Area(candyBag1, "Bulevardul Iului Maniu", 10);
        Area area2 = new Area(candyBag2, "Str. Brasov", 25);

        System.out.println("Area1: ");
        area1.printAddress();
        System.out.println("Area2: ");
        area2.printAddress();
    }
}
