package bh4;

import java.util.ArrayList;
import java.util.List;

public class Gio {
	private List<sanPham> ds = null;

	public Gio() {
		this.ds = new ArrayList<sanPham>();
	}

	public void mua(sanPham s, int soLuong) {
		var kq = this.tim(s.getMa());
		if (kq == null) {
			s.setSoLuong(soLuong);
			ds.add(s);
		} else {
			kq.setSoLuong(kq.getSoLuong() + soLuong);
		}
	}

	private sanPham tim(int ma) {
		for (var s : ds) {
			if (ma == s.getMa())
				return s;
		}
		return null;
	}

	public double tongTien() {
		double gia1SP;
		double tong = 0;
		for (var s : ds) {
			gia1SP = s.getSoLuong() * s.getGia();
			tong = tong + gia1SP;
		}
		return tong;
	}

	public void hienThi() {
		if (ds.size() == 0) {
			System.out.println("Danh sach rong!");
		} else {
			for (var s : ds)
				System.out.println(s);
		}
	}

}
