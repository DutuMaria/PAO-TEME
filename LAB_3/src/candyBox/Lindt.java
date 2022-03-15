package candyBox;

import java.util.Objects;

public class Lindt extends CandyBox{
    private double length;
    private double width;
    private double height;

    public Lindt() {}
    public Lindt(String flavor, String origin, double length, double width, double height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() { return width; }
    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return this.height * this.length * this.width;
    }

    @Override
    public String toString() {
        return "The " +
                this.getOrigin() +
                " " +
                this.getFlavor() +
                " has volume " +
                this.getVolume();

//        return "Lindt{" +
//                "length=" + length +
//                ", width=" + width +
//                ", height=" + height +
//                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lindt lindt = (Lindt) o;
        return super.equals(lindt) && Double.compare(lindt.length, length) == 0 && Double.compare(lindt.width, width) == 0 && Double.compare(lindt.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }
}
