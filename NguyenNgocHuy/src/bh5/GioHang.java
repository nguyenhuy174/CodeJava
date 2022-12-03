package bh5;

import java.util.ArrayList;
import java.util.List;

import bh4.sanPham;

public class GioHang extends ArrayList<SanPham> {

	public void mua(SanPham sanPham, int soLuong) {
		var kq = this.tim(sanPham.getMa());
		if (kq == null) {
			sanPham.setSoLuong(soLuong);
			this.add(sanPham);
		} else {
			kq.setSoLuong(kq.getSoLuong() + soLuong);
		}
	}

	private SanPham tim(int ma) {
		for (var s : this ) {
			if (ma == s.getMa())
				return s;
		}
		return null;
	}

	public void mua() {
		mua(new SanPham(1, "tivi", 100), 10);
	}

	public void xoa(int ma) {
		this.remove(this.tim(ma));
	}

	public void xoa() {
		this.clear();
	}

	public double tien() {
		double gia1SP;
		double tong = 0;
		for (var s : this) {
			gia1SP = s.getSoLuong() * s.getGia();
			tong = tong + gia1SP;
		}
		return tong;
	}

}
