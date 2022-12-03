package bh2tamGiac;

public class Client {
	public static void main(String[] args) {
		Tamgiac tg = new Tamgiac(3, 3, 4);
		if (tg.can())
			System.out.println("Tam giac can");
		else
			System.out.println("Tam giac khong can");
	}


}

