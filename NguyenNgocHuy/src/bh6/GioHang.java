package bh6;

import java.util.ArrayList;
import bh5.SanPham;


public class GioHang extends ArrayList<SanPham> implements IGioHang {

	@Override
	public void mua(SanPham sanPham, int soLuong) {
		var kq = this.tim(sanPham.getMa());
		if (kq == null) {
			sanPham.setSoLuong(soLuong);
			this.add(sanPham);
		} else {
			kq.setSoLuong(kq.getSoLuong() + soLuong);
		}
	}

	public SanPham tim(int ma) {
		for (var s : this) {
			if (ma == s.getMa())
				return s;
		}
		return null;
	}

	@Override
	public void xoa(int ma) {
		this.remove(this.tim(ma));
	}

	@Override
	public void xoa() {
		this.clear();
	}

	@Override
	public double tien() {
		double gia1SP;
		double tong = 0;
		for (var s : this) {
			gia1SP = s.getSoLuong() * s.getGia();
			tong = tong + gia1SP;
		}
		return tong;
	}

	@Override
	public void hienThi() {
		if (this.size() == 0) {
			System.out.println("Danh sach rong!");
		} else {
			for (var s : this)
				System.out.println(s);
		}
	}

}
