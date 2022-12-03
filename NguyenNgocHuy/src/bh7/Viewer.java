package bh7;

public class Viewer implements IListener {

	private final String ten;

	private int ma;

	public Viewer(int ma, String ten) {
		this.ten = ten;
		this.ma = ma;
	}

	@Override
	public boolean equals(Object obj) {
		return this.ma == ((Viewer) obj).ma;
	}

	@Override
	public void response(Object from, EventArg e) {
		if (((Youtuber) from).getHang() == 1)
			if (((Video) e).getChuDe().toUpperCase().contains("JAVA"))
				System.out.println(this.ten + " vao xem ngay!");
			else
				System.out.println(this.ten + " ko xem");
		else
			System.out.println(this.ten + " ko xem");
	}

	public int getMa() {
		return this.ma;
	}

	@Override
	public void subscribe(IGenerator x) {
		x.them(this);
	}

}
