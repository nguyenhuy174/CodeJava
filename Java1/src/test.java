import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		int num1 = 3, num2 = 5, num3 = 7;
//		int max = num1;
//		if (num2 > max)
//			max = num2;
//		if (num3 > max)
//			max = num3;
//		System.out.println("So lon nhat la: " + max);
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		for (var j = 1; j <= 10; j++) {
//			System.out.println(j);
//		}
		System.out.println(tong(5, 2));
		System.out.println(hieu(5, 2));
		System.out.println(tich(5, 2));
	}

	private static int hieu(int a, int b) {
		return a - b;
	}

	private static int tich(int a, int b) {
		return a * b;
	}

	private static int tong(int a, int b) {
		return a + b;
	}

}
