package bh5;

public class Tron extends Hinh {
	private double banKinh;

	public Tron(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public double dienTich() {
		return Math.pow(this.banKinh, 2) * 3.1415926;
	}
}
