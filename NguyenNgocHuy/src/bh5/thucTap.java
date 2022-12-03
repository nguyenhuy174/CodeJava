package bh5;

public class thucTap extends CongTy {

	private int luongNC;
	private int soNC;

	public thucTap(int luongNC, int soNC) {
		this.luongNC = luongNC;
		this.soNC = soNC;
	}

	@Override
	public double tinhLuong() {
		System.out.print("Luong nhan vien thuc tap: ");
		return this.luongNC * this.soNC;
	}

}
