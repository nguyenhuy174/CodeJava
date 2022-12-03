package NguyenNgocHuy;

import java.io.FileWriter;

public class Client {
	public static void main(String[] args) {
		IBook IB = new ThuVien();
		Book b1 = new Book(1, "Doraemon", "Fujiko", 24);
		Book b2 = new Book(2, "Conan", "Aoyama", 25);
		Book b3 = new Book(3, "Dragon Ball", "ABCDE", 15);
		try {
			FileWriter fw = new FileWriter("E:\\book.txt");
			fw.write(b1.getId() + " " + b1.getName() + " " + b1.getAuthor() + " " + b1.getImportDay() + " ");
			fw.write(b2.getId() + " " + b2.getName() + " " + b2.getAuthor() + " " + b2.getImportDay() + " ");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		IB.them(b1, 3);
		IB.them(b2, 2);
		IB.them(b3, 4);
		IB.hienThi();
		System.out.println("Quyen sach tim duoc la: " + IB.tim("Conan"));
//		 IB.xoa(1);
//		 System.out.println("---Sau khi xoa---");
//		 IB.hienThi();
	}
}
