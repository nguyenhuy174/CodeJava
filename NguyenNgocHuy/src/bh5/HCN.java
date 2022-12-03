package bh5;

public class HCN extends Hinh {

	private double chieuDai;
	private double chieuRong;

	public HCN(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double dienTich() {
		return this.chieuDai * this.chieuRong;
	}

}
