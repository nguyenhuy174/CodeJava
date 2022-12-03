package bh2;

public class Client {
	public static void main(String[] args) {
		PhanSo p = new PhanSo(2, 7);
		PhanSo q = new PhanSo(6, 8);
		//System.out.println(p.getTu()+"/"+p.getMau());
		//System.out.println(q.getTu()+"/"+q.getMau());
		System.out.println(p.toString());
		System.out.println(q.toString());
		System.out.println("Ket qua: ");
		var kq = p.cong(q);
		System.out.println(kq.toString());		
		var kqtru = p.tru(q);
		System.out.println(kqtru.toString());		
		var kqnhan = p.nhan(q);
		System.out.println(kqnhan.toString());		
		var kqchia = p.chia(q);
		System.out.println(kqchia.toString());		
	}
}
