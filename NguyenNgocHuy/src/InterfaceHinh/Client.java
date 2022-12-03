package InterfaceHinh;

public class Client {
	public static void main(String[] args) {

		IHinh hcn1 = new HCN(5, 3);
		IHinh tr1 = new Tron(10);
		IHinh tg1 = new tamGiac(3, 4, 5);
		System.out.println("Chu vi HCN: " + hcn1.chuVi());
		System.out.println("Dien tich HCN: " + hcn1.dienTich());
		System.out.println("Chu vi Hinh Tron: " + tr1.chuVi());
		System.out.println("Dien tich Hinh Tron: " + tr1.dienTich());
		System.out.println("Chu vi Hinh Tam Giac: " + tg1.chuVi());
		System.out.println("Dien tich Hinh Tam Giac: " + tg1.dienTich());
	}
}
