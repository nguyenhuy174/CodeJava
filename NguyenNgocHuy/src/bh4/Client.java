package bh4;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Client {

	public static void main(String[] args) {
		// testCollection1();
		// testCollection2();
		testCollection3();
		// maNhiPhanStack(6);
//Ung dung Collection Quan ly san pham
		sanPham s1 = new sanPham(1, "tivi", 120);
		sanPham s2 = new sanPham(2, "smatphone", 150);
		sanPham s3 = new sanPham(3, "nitendo switch", 250);
		sanPham s4 = new sanPham(4, "Play Station 5", 550);
//		kho.them(s2, 5);
//		kho.them(s1, 10);
//		kho.them(s3, 15);
//		kho.xoa(1);
//		kho.xoa(new sanPham(2, "smatphone", 150));
//		kho.hienThi();
		System.out.println("---Thong tin gio hang---");
		Gio g = new Gio();
		g.mua(s1, 10);
		g.mua(s2, 11);
		g.mua(s3, 12);
		g.mua(s4, 13);
		g.hienThi();
		System.out.println("Tong tien: "+ g.tongTien());
		
	}

	private static void testCollection3() {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(5);
		q.add(7);
		q.add(9);
		q.add(11);
		q.add(13);
		for(var s:q) {
			System.out.println(s);
		}
		while (q.size() > 0) {
			System.out.println(q.poll());
		}
		if (q.size() == 0)
			System.out.println("Queue null!");
	}

	private static void maNhiPhanStack(int n) {
		Stack<Integer> s = new Stack<>();
		while (n > 0) {
			s.push(n % 2);
			n = n / 2;
		}
		while (s.size() > 0)
			System.out.print(s.pop());
	}

	private static void testCollection2() {
		Stack<String> nx = new Stack<>();
		nx.add("tuan");
		nx.add("binh");
		nx.push("linh");
		while (nx.size() > 0) {
			var kq = nx.pop();
			System.out.println(kq);
		}
	}

	private static void testCollection1() {
		List<Integer> ds = new ArrayList<Integer>();
		ds.add(1);
		ds.add(2);
		ds.add(3);
		ds.add(0, 182);
		ds.add(1, 150);
		Integer t = 123;
		ds.add(t);
		ds.remove(t);
		ds.remove(1);
		for (var i : ds)
			System.out.println(i);
		ds.clear();
		if (ds.size() == 0)
			System.out.println("Danh sach rong!");
	}

}
