package bh7;

public class PTB2 {
    private final double a, b, c;

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Nghiem giai() {
        var d = this.delta();
        if (d < 0) return null;
        else return new Nghiem(
                (-b - Math.sqrt(d)) / (2 * a), (-b + Math.sqrt(d)) / (2 * a)
        );
    }

    private double delta() {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
