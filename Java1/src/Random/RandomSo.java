package Random;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class RandomSo {
	public static void main(String[] args) {
		int[] luckyNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 };

		for (int i = 0; i < 100; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao so thu tu: ");
			int stt = sc.nextInt();

			var bienRandom = usingThreadLocalClass();
			var count = demPhanTu(luckyNum);
			System.out.println("Your lucky number: " + stt + " - " + bienRandom);

			if (kiemTraTonTai(luckyNum, count, bienRandom) == 1) {
				var viTriBienTimDuoc = timViTriPhanTu(luckyNum, count, bienRandom);
				XoaPhanTu(luckyNum, count, viTriBienTimDuoc);
				xuatMang(luckyNum);
				System.out.println();
			} else {
				System.out.println("But SORRY, The number is not existing anymore!");
			}
		}

	}

	private static int kiemTraTonTai(int[] luckyNum, int count, int bienRandom) {
		for (int i = 0; i < count; i++) {
			if (luckyNum[i] == bienRandom)
				return 1;
		}
		return 0;
	}

	private static void xuatMang(int[] luckyNum) {
		for (int i = 0; i < 36; i++) {
			System.out.print(luckyNum[i] + "  ");
		}
	}

	private static int timViTriPhanTu(int[] luckyNum, int count, int bienRandom) {
		for (int j = 0; j < count; j++) {
			if (luckyNum[j] == bienRandom)
				return j;
		}
		return 0;
	}

	private static int demPhanTu(int luckyNum[]) {
		int count1 = 0;
		for (int i = 0; i < 36; i++) {
			if (luckyNum[i] != i)
				count1 = i;
		}
		return count1;
	}

	private static int usingThreadLocalClass() {
		int ranNum = ThreadLocalRandom.current().nextInt(1, 36);
		return ranNum;
	}

	private static void XoaPhanTu(int luckyNum[], int count, int pos) {

		if (pos < 0) {
			pos = 0;
		} else if (pos >= count) {
			pos = count - 1;
		}
		for (int j = pos; j < count; j++) {
			luckyNum[j] = luckyNum[j + 1];
			luckyNum[j + 1] = 0;
		}
		// --count;
	}
}
