package bh10;
//install window builder in marketplace

//Start --> Run
//		JVM

//BaiToan1: mở rộng bài toán thành 1 danh sách các phòng thực hành
//BaiToan2: Bài toán sản xuất và tiêu thụ Producer and consummer problem
//BaiToan3: 1 triệu phần tử, 5 thread, tìm thấy 1 phần tử nào đó thì notify
public class Client {
	public static void main(String[] args) {
//		cach3();
//		cach1();
//		cach2();
//		nhieuThreadHD();
//		System.out.println(Thread.currentThread().getName());
//---------------------------------------------
//		Thread t1 = new NumberThread();
//		Thread t2 = new NumberThread();
//		t1.start();
//		try {
//			t1.join(); // doi thread ket thuc
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
//		t2.start();
// --------------------------------------------------------
//		int soCanTim = 5;
//		Thread th1 = new timKiem(soCanTim,1, 200);
//		th1.start();
//		Thread th2 = new timKiem(soCanTim,200, 400);
//		th2.start();
//		Thread th3 = new timKiem(soCanTim,400, 600);
//		Thread th4 = new timKiem(soCanTim,600, 800);
//		Thread th5 = new timKiem(soCanTim,800, 1000);
//-----------------------------------------------------
		Thread l1 = new Lop("CN20A");
		Thread l2 = new Lop("CN20B");
		l1.start();
		l2.start();
	}

	private static void khoiTao(int n) { //tao mang voi so phan tu: n
		int a[] = new int[n];
		for (var i = 1; i <= n; i++) {
			a[i] = i;
		}
	}

	private static void nhieuThreadHD() {
		Thread t1 = new MyThread();
		Thread t2 = new Thread(new OtherThread());
		t1.start();
		try {
			t1.join(); // doi thread ket thuc
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		t2.start();
	}

	private static void cach2() {
		Thread t = new Thread(new OtherThread());
		t.start();
	}

	private static void cach1() {
		Thread t = new MyThread();
		t.start();
	}

	private static void cach3() {
		Thread t = new Thread(new Runnable() { // tao ra thread
			@Override
			public void run() {
				System.out.println("thread dang chay");
			}

		});
		// thuc thi thread
		t.start();
	}
}
