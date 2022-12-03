package bh10;

public class MyThread extends Thread {
	@Override
	public void run() {
		this.setName("My Thread");
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName());
	}
}
