package bh4;

import java.util.ArrayList;
import java.util.List;

public class kho {
	static private List<sanPham> ds = new ArrayList<>();

	public static void them(sanPham s) {
		ds.add(s);
	}

	public static void hienThi() {
		if (ds.size() == 0) {
			System.out.println("Danh sach rong!");
		} else {
			for (var s : ds)
				System.out.println(s);
		}
	}

	public static void them(sanPham s, int soLuong) {
		sanPham kq = kho.tim(s.getMa());
		if (kq == null) {
			// Insert
			s.setSoLuong(soLuong);
			ds.add(s);
		} else { // Update so luong
			kq.setSoLuong(kq.getSoLuong() + soLuong);
		}
	}

	public static sanPham tim(int ma) {
		for (var s : ds) {
			if (ma == s.getMa())
				return s;
		}
		return null;
	}

	public static void xoa(int ma) {
		ds.remove(tim(ma));
	}

	public static void xoa(sanPham s) {
		xoa(s.getMa());
	}
}
