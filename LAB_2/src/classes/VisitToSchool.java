package classes;

public class VisitToSchool {
    public static void main(String[] args) {

        Person persoana1 = new Person("Iolanda", "Popescu", 40, 126363789L, "persoana1");
        Person persoana2 = new Person("Cristina", "Ionescu", 35, 637189334L, "persoana2");

        Room clasa1 = new Room(5, "amfiteatru", 1);
        Room clasa2 = new Room(3, "amfiteatru", 2);

        Subject materie1 = new Subject(clasa1, 100, persoana1);
        Subject materie2 = new Subject(clasa2, 150, persoana2);

        materie1.display();
        System.out.println();
        System.out.println();
        materie2.display();

        StructuraScoala strScoala = StructuraScoala.getStructuraScoala();
        System.out.println();
        StructuraScoala.showScoala();
//       strScoala.showScoala();


    }

}
