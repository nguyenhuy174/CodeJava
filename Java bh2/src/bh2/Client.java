package bh2;

public class Client {
	public static void main(String[] args) {
	//	SanPham s = new SanPham(ma:1,ten:"tivi",gia:123);
	//	SanPham r = new SanPham(ma:2,ten:"dien thoai",gia:456);
	//	s.hienThi();
	//	System.out.println(s.toString());
		PhanSo p = new PhanSo(2,4);
		PhanSo q = new PhanSo(2,3);
		var kq = p.cong(q);
		System.out.println(p.toString());
		
	}
}
