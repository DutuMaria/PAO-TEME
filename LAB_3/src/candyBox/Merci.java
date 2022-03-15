package candyBox;
import java.lang.Math;
import java.util.Objects;

public class Merci extends CandyBox{
    private double length;

    public Merci() {}
    public Merci(String flavor, String origin, double length) {
        super(flavor, origin);
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getVolume() {
        return Math.pow(this.length, 3);
    }

    @Override
    public String toString() {
        return "The " +
                this.getOrigin() +
                " " +
                this.getFlavor() +
                " has volume " +
                this.getVolume();

//        return  "Merci{" +
//                "length=" + length +
//                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merci merci = (Merci) o;
        return super.equals(merci) && Double.compare(merci.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
