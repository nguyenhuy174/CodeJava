package bh3;
//ctrl f6: chuyen tab qua lai
//ctrl f3: truy tan goc re
public class Client {
	public static void main(String[] args) {
		// khai bao int khi khong gan gia tri

		// SO NGUYEN TO
		var n = 15;
		maNP(n);
		System.out.println(kiemTraNT(n));
//		System.out.println(String.format("%d! = %d", n, kq));
//		boolean nTo = kiemTraNT(n);
//		var kq = "";
////		if (nTo)
////			kq = String.format("%d la so nguyen to", n);
////		else
////			kq = String.format("%d la hop so", n);
////		System.out.println(kq);
		HCN h = new HCN(7,10);
		System.out.println("Chu vi HCN : "+ h.chuVi());
		System.out.println("Dien tich HCN : "+ h.dienTich());
		if(h.vuong())
			System.out.println("day la hinh vuong");
		//h.to('*');
		//h.vekhung('*');
	}

	private static void maNP(int n) {
		if (n < 2)
			System.out.print(n);
		else {
			maNP(n / 2);
			System.out.print(n % 2);
		}
	}

	private static boolean kiemTraNT(int n) {
		var i = 1;
		while (n % i > 0)
			i++;
		return (i == n);
	}

	private static int nGiaiThua(int i) {
		int kqGiaiThua = 1;
		for (int j = 1; j <= i; j++) {
			kqGiaiThua = kqGiaiThua * j;
		}
		return kqGiaiThua;
	}

	private static int GiaiThua(int n) {
		if (n == 0)
			return 1;
		else
			return n * GiaiThua(n - 1);
	}

	private static int ucln(int i, int j) {
		while (i * j > 0)
			if (i > j)
				i = i - j;
			else
				j = j - i;
		return i + j;

	}

	private static double gui(double tongTien, int laiSuat, int soThang) {
		for (var i = 1; i <= soThang; i++) {
			tongTien = tongTien + tongTien * laiSuat / 100;
		}
		return tongTien;
	}

	private static int tong(int a, int b) {
		var kq = 0;
		if (a > b) {
			var t = a;
			a = b;
			b = t;
		}
		/*
		 * for (int i = a; i <= b; i++) { kq = kq + a; }
		 */
		var i = a;
		while (i <= b) {
			kq = kq + i;
			i++;
		}
		return kq;
	}
	private static int tongN(int n) {
		var kq = 0;
		var i = 1;
		while (i <= n) {
			kq = kq + i;
			i++;
		}
		return kq;
	}
}
