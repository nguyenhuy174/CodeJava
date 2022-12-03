package NguyenNgocHuy;

public class Book {

	private int id;
	private String name;
	private String author;
	private int importDay;
	private int soLuong;

	public Book(int id, String name, String author, int importDay) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.importDay = importDay;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getImportDay() {
		return importDay;
	}

	public void setImportDay(int importDay) {
		this.importDay = importDay;
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %s, %d, %d", id, name, author, importDay, soLuong);
	}
}
