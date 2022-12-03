package bh6;
import bh5.SanPham;

public class Client {
	public static void main(String[] args) {
		IGioHang gh = new GioHang();
		gh.mua(new SanPham(1, "tivi", 100), 10);
		SanPham s2 = new SanPham(2, "laptop", 200);
		SanPham s3 = new SanPham(3, "dien thoai", 400);
		
		gh.mua(s2, 5);
		gh.mua(s3, 5);
//		 gh.xoa(1);
//		 gh.xoa();
		 gh.hienThi();
		System.out.println("Tong tien: " + gh.tien());
	}
}
