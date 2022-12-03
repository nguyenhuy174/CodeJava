package bh2;

public class Client {
    public static void main(String[] args) {
        TamGiac tg = new TamGiac(3,3,4);
        if(tg.can())
            System.out.println("tam giac can");
        else
            System.out.println("tam giac khong can");

//        PhanSo p = new PhanSo(2, 4);
//        PhanSo q = new PhanSo(2, 3);
////        var kq = p.nhan(q);
//        var kq = PhanSo.cong(p,q);
//        System.out.println(kq.toString());


//        SanPham s = new SanPham(1,"tivi",123);
//        SanPham r = new SanPham(2,"dien thoai",456);
////        s.hienThi();
//        System.out.println(s.toString());
    }
}
