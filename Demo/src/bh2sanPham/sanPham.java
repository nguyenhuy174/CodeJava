package bh2sanPham;

public class sanPham {

	private int ma;
	private String ten;
	private double gia;

	public sanPham(int m, String t, double g) {
		this.ma = m;
		this.ten = t;
		this.gia = g;
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %.2f", ma, ten, gia);
	}
}
