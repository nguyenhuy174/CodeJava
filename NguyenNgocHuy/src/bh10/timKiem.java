package bh10;

public class timKiem extends Thread {
	private int soCanTim;
	private int a;
	private int n;

	public timKiem(int soCanTim, int a, int n) {
		this.soCanTim = soCanTim;
		this.a = a;
		this.n = n;
	}

	@Override
	public void run() {
		int a[] = new int[1000];
		for (var i = this.a; i < this.n; i++) {
			a[i] = i;
		}
		for (var j = this.a; j < this.n; j++) {
			if (this.soCanTim == j) {
				System.out.println("So can tim co trong mang: " + j);
			}
		}
		System.out.println("---");

	}
}
