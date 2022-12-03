package InterfaceHinh;

public class tamGiac implements IHinh {

	private final int canh1;

	private final int canh2;

	private final int canh3;

	private final int nuaChuVi;

	public tamGiac(int c1, int c2, int c3) {
		this.canh1 = c1;
		this.canh2 = c2;
		this.canh3 = c3;
		this.nuaChuVi = (this.canh1 + this.canh2 + this.canh3) / 2;
	}

	@Override
	public double chuVi() {
		return this.canh1 + this.canh2 + this.canh3;
	}

	@Override
	public double dienTich() {
		return Math.sqrt(this.nuaChuVi * (this.nuaChuVi - this.canh1) 
						* (this.nuaChuVi - this.canh2)
						* (this.nuaChuVi - this.canh3));
	}

}
