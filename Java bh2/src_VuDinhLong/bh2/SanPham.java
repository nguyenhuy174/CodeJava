package bh2;
public class SanPham {
    private final double gia;
    private final String ten;
    private final int ma;
    public SanPham(int m, String t, double g) {
        this.ma = m;
        this.ten = t;
        this.gia = g;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f",ma,ten,gia);
    }
}
