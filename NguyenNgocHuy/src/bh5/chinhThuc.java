package bh5;

public class chinhThuc extends CongTy {

	private int luongCB;
	private double heSo;

	public chinhThuc(int luongCB, double heSo) {
		this.luongCB = luongCB;
		this.heSo = heSo;
	}

	@Override
	public double tinhLuong() {
		System.out.print("Luong nhan vien chinh thuc: ");
		return this.luongCB * this.heSo;
	}

}
