package bh10;

public class Phong {
	private final String ten;
	private boolean trong;

	public Phong(String ten, boolean trong) {
		this.ten = ten;
		this.trong = trong;
	}

	public String getTen() {
		return this.ten;
	}

	public boolean getTrong() {
		return this.trong;
	}

	public void setTrong(boolean b) {
		this.trong = b;
	}
}
