package area;

import candyBag.CandyBag;

public class Area {
    private CandyBag candyBag;
    private String street;
    private int number;

    public Area() {}
    public Area(CandyBag candyBag, String street, int number) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public CandyBag getCandyBag() { return candyBag; }
    public void setCandyBag(CandyBag candyBag) { this.candyBag = candyBag; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public void printAddress(){
        System.out.println("=> ADRESA: " + this.street + " " + this.number);
        System.out.println("=> Continut CandyBag: ");
        for (var box:this.candyBag.getCandyBox()){
            System.out.println("\t\t" + box.toString());
        }
    }
}
