package bh7;

public class Nghiem {

    private final double x2, x1;

    public Nghiem(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "(" + x1 + ", " + x2 + ")";
    }
}
