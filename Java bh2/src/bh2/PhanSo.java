package bh2;

public class PhanSo {
	private final int tu;
	
	private final int mau;
	
	public PhanSo() {
		this.tu=0;
		this.mau=1;
	}
	public PhanSo(int tu, int mau) {
		this.tu= tu;
		this.mau = mau;
		this.rutGon();
	}
	private PhanSo rutGon() {
		var u = ucln(this.tu, this.mau);
		this.tu = this.tu /u;
		this.mau/=u;
		return this;
	}
	
	
	private int ucln(int tu2, int mau2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public PhanSo cong(PhanSo q) {
		PhanSo tong = new PhanSo();
		tong.tu= this.tu * q.mau + this.mau * q.tu;
		tong.mau= this.mau * q.mau;
		return tong;
	}
	
	@Override
	public String toString() {
		return this.tu + "/" +this.mau;
	}
	/*private final double gia;
	private final String ten;
	private final int ma;
	
	public SanPham(int ma, String ten, double gia) {
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
	}*/
	
	

}
