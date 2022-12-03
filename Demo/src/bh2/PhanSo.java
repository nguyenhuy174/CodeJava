package bh2;

public class PhanSo {
	private int tu;
	private int mau;

	public PhanSo() {
		this.tu = 0;
		this.mau = 1;
	}

	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	public int getTu() {
		return tu;
	}

	public int getMau() {
		return mau;
	}

	public int UCLN(int a, int b) {
		if (a % b != 0) {
			return UCLN(b, a % b);
		} else {
			return b;
		}
	}

	private PhanSo rutGon() {
		var u = UCLN(this.tu, this.mau);
		this.tu /= u;
		this.mau /= u;
		return this;
	}

	public PhanSo cong(PhanSo q) {
		PhanSo tong = new PhanSo();
		tong.tu = this.tu * q.mau + this.mau * q.tu;
		tong.mau = this.mau * q.mau;
		tong.rutGon();
		return tong;
	}
	
	public PhanSo tru(PhanSo q) {
		PhanSo hieu = new PhanSo();
		hieu.tu = this.tu * q.mau - this.mau * q.tu;
		hieu.mau = this.mau * q.mau;
		hieu.rutGon();
		return hieu;
	}
	public PhanSo nhan(PhanSo q) {
		PhanSo nhan = new PhanSo();
		nhan.tu = this.tu * q.tu;
		nhan.mau = this.mau * q.mau;
		nhan.rutGon();
		return nhan;
	}
	public PhanSo chia(PhanSo q) {
		PhanSo chia = new PhanSo();
		chia.tu = this.tu * q.mau ;
		chia.mau = this.mau * q.tu;
		chia.rutGon();
		return chia;
	}

	@Override
	public String toString() {
		return this.tu + "/" + this.mau;
	}
}
