package bh5;

public class SanPham {

	private int ma;
	private String ten;
	private double gia;
	private int soLuong;
	
	public SanPham(int m, String t, double g) {
		this.ma = m;
		this.ten = t;
		this.gia = g;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return String.format("%d| %s, %.2f, %d", ma, ten, gia, soLuong);
	}
}
