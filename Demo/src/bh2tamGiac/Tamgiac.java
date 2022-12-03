package bh2tamGiac;

public class Tamgiac {
	private final int canh1;

	private final int canh2;

	private final int canh3;

	public Tamgiac(int c1, int c2, int c3) {
		this.canh1 = c1;
		this.canh2 = c2;
		this.canh3 = c3;
	}

	public boolean can() {
		return this.canh1 == this.canh2 || 
			   this.canh2 == this.canh3 || 
			   this.canh3 == this.canh1;
	}

}
