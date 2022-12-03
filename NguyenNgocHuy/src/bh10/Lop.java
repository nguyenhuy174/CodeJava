package bh10;

public class Lop extends Thread {
	private final String ten;
	private static Phong h003 = null;

	static {
		h003 = new Phong("H003", true);
	}

	public Lop(String ten) {
		this.ten = ten;
	}

	@Override
	public void run() {
		dongBoTrenBlock();
	}

	private void dongBoTrenBlock() {
		synchronized (h003) {
			while (!h003.getTrong()) {

				try {
					h003.wait();
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				System.out.println("Lop " + ten + " su dung phong " + h003.getTen());
				h003.setTrong(false);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				h003.setTrong(true);
				h003.notify();
				System.out.println("Lop " + ten + " tra phong " + h003.getTen());
			}
		}
	}

	private void biMatDongBo() {
		if (h003.getTrong()) {
			System.out.println("Lop " + ten + " su dung phong " + h003.getTen());
			h003.setTrong(false);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			h003.setTrong(true);
			System.out.println("tra phong");
		}
	}

}
