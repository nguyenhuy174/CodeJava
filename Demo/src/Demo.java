import java.util.Scanner;
import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		// var n = 2;
		// System.out.println("Ket qua: " + laSoNguyenTo(n));
		System.out.println(tongTien(10000, 10, 2));

	}

	/*
	 * private static boolean laSoNguyenTo(int n) { var i = 2; while (n % i > 0)
	 * i++; return i == n; }
	 */
	private static double tongTien(double soTien, double laiSuat, int n) {
		for (var i = 1; i <= n; i++)
			soTien = soTien + soTien * laiSuat / 100;
		return soTien;
	}
}
