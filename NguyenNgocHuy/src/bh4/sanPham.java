package bh4;

public class sanPham {
	private int ma;
	private String ten;
	private double gia;
	private int soLuong;

	public sanPham(int m, String t, double g) {
		this.ma = m;
		this.ten = t;
		this.gia = g;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}
	@Override
	public String toString() {
		return String.format("%d, %s, %.2f, %d", ma, ten, gia, soLuong);
	}
}
