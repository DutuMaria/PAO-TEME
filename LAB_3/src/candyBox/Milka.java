package candyBox;

import java.lang.Math;
import java.util.Objects;

public class Milka extends CandyBox {
    private double radius;
    private double height;

    public Milka() {
    }

    public Milka(String flavor, String origin, double radius, double height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public double getVolume() { return Math.PI * Math.pow(radius, 2) * height; }

    @Override
    public String toString() {
        return "The " +
                this.getOrigin() +
                " " +
                this.getFlavor() +
                " has volume " +
                this.getVolume();
//        return "Milka{" +
//                "radius=" + radius +
//                ", height=" + height +
//                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milka milka = (Milka) o;
        return super.equals(milka) && Double.compare(milka.radius, radius) == 0 && Double.compare(milka.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }
}
