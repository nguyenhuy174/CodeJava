package bh3;

public class HCN {

	private double chieuDai;
	private double chieuRong;
	public boolean vuong;

	public HCN(double cr, double cd) {
		this.chieuDai = cd;
		this.chieuRong = cr;
	}

	public double chuVi() {
		return (this.chieuDai + this.chieuRong) * 2;
	}

	public double dienTich() {
		return this.chieuDai * this.chieuRong;
	}

	public boolean vuong() {
		return this.chieuDai == this.chieuRong;
	}

	public void to(char c) {// round = lam tron so
		if (chieuDai == Math.round(chieuDai) && chieuRong == Math.round(chieuRong)) {
			for (var i = 1; i <= chieuRong; i++) {
				for (var j = 1; j <= chieuDai; j++) {
					System.out.print(c);
				}
				System.out.println();
			}
		} else
			System.out.println("khong the to");
	}

	public void vekhung(char c) {
		if (chieuDai == Math.round(chieuDai) && chieuRong == Math.round(chieuRong)) {
			for (var i = 1; i <= chieuRong; i++) {
				for (var j = 1; j <= chieuDai; j++) {
					if (i == 1 || i == chieuRong || j == 1 || j == chieuDai) {
						System.out.print(c);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else
			System.out.println("khong the ve khung");
	}

}
