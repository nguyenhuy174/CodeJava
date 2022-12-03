
package bh5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 Có 2 loại nhân viên là chính thức và thực tập.
 Nhân viên chính thức tính lương = Lương cơ bản * Hệ số;
 Nhân viên thực tập tính lương = Số ngày công * Lương ngày công
 Xây dựng lớp Công ty, chứa cả 2 loại nhân viên trên
 và tính lương cho mỗi thành viên trong Công ty
 */

/* extends -> class
 * implements -> interface
 * 
 * Bài tập:
 interface : chỉ có khai báo
 chuẩn bị bài tập interface gio hàng
 */

public class Client {

	public static void main(String[] args) {
//		GioHang gh = new GioHang();
//		gh.mua(new SanPham(1, "tivi", 100), 10);
//		SanPham s2 = new SanPham(2, "laptop", 200);
//		gh.mua(s2, 5);
//		//gh.mua();
//		gh.xoa(1);
//		gh.xoa();
//		System.out.println(gh.tien());

		// CongTy.java
//		List<CongTy> ds = new ArrayList<CongTy>();
//		ds.add(new chinhThuc(5000, 3));
//		ds.add(new thucTap(200, 25));
//		for (var h : ds)
//			System.out.println(h.tinhLuong());

		// Hinh.java
//		List<Hinh> hinh = new ArrayList<Hinh>();
//		hinh.add(new HCN(5, 3));
//		hinh.add(new Tron(10));
		// for (var h : hinh)
		// System.out.println(h.dienTich());

//		 viDu1();
//		 viDu2();
		
//		try {
//			HocSinh hs = new HocSinh(1, "tuan", 9);
//			System.out.println(hs.toString());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		int num1 =5;
		try {
			System.out.println(num1);
			if(num1<10)
				throw new Throwable("Invalid number! Try again...");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	private static void viDu2() {
		System.out.print("nhap diem = ");
		Scanner s = new Scanner(System.in);
		try {
			int diem = s.nextInt();
			if (diem < 0 || diem > 10)
				throw new Throwable("diem khong hop le!");
			System.out.println("diem = " + diem);
		} catch (Throwable ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void viDu1() {
		try {
			String chuoi = "tran van tuan";
			var kq = Integer.parseInt(chuoi);
			System.out.println(kq);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("chuoi khong hop le!");
		}
	}
}
