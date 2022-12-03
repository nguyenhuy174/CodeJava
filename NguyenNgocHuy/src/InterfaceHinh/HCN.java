package InterfaceHinh;

public class HCN implements IHinh {
	private double chieuDai;
	private double chieuRong;

	public HCN(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double chuVi() {
		return (this.chieuDai + this.chieuRong) * 2;
	}

	@Override
	public double dienTich() {
		return this.chieuDai * this.chieuRong;
	}

}
