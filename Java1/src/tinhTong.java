import java.util.Scanner;

public class tinhTong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen A: ");
		int numa = sc.nextInt();
		System.out.println("Nhap vao so nguyen B: ");
		int numb = sc.nextInt();
		int sum = 0;
		for (int i = numa; i <= numb; i++) {
			sum = sum + i;
		}
		System.out.println("Tong so nguyen tu A den B la: " + sum);
	}
}
