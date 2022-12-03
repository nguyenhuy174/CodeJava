package bh5;

public class HocSinh {

	private int ma;
	private String ten;
	private int diem;

	public HocSinh(int ma, String ten, int diem) throws DiemException {
		this.ma = ma;
		this.ten = ten;
		this.diem = diem;
		if (diem < 0 || diem > 10)
			throw new DiemException("diem khong hop le!");

	}

	@Override
	public String toString() {
		return "Hoc sinh: " + ma + ", " + ten + ", " + diem;
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

}
