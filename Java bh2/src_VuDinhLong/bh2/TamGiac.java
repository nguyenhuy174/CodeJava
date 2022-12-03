package bh2;

public class TamGiac {
    private
    int a, b, c;

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean can() {
        return a==b||b==c||c==a;
    }
}
