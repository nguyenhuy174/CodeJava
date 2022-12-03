package bh2sanPham;

public class Client {
	public static void main(String[] args) {
		sanPham sp1 = new sanPham(1, "Tivi", 50000);
		sanPham sp2 = new sanPham(2, "dien thoai", 456);
		//sp1.hienThi();
		System.out.println(sp1.toString());
	}
}