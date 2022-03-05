package classes;

public class StructuraScoala {
    private static String name;
    private static StructuraScoala structuraScoala;

    private StructuraScoala() {
        name = "Scoala nr. 113";
    }

    public static StructuraScoala getStructuraScoala() {
        if (structuraScoala == null)
            structuraScoala = new StructuraScoala();
        return structuraScoala; }

    public static void showScoala(){ System.out.println("Scoala: " + name);}

}
