package bh6;

import bh5.SanPham;

public interface IGioHang {
	
	public void mua(SanPham sanPham, int soLuong);

	public void xoa(int ma);

	public void xoa();

	public double tien();

	public void hienThi();
}
