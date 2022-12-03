package InterfaceHinh;

public class Tron implements IHinh {
	private double banKinh;

	public Tron(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public double chuVi() {
		return this.banKinh * 2 * 3.1415926;
	}

	@Override
	public double dienTich() {
		return Math.pow(this.banKinh, 2) * 3.1415926;
	}

}
