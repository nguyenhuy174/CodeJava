package bh1;

public class Demo {
    //    b1: viet ham kiem tra so n nguyen to hay ko?
//    b2: cho so tien ban dau = a, lai saut = k, so thang gui = n,
//    tinh so tien gửi sau n tháng.
//    b3: tinh so ngay cua thang t nam n bat ky

    public static void main(String[] args) {
        System.out.println(tongTien(10000000, 10, 2));
    }

    private static double tongTien(double soTien, double laiSuat, int n) {
        for (var i = 1; i <= n; i++)
            soTien = soTien *(1+  laiSuat / 100);
        return soTien;
    }

    private static boolean kiemTraNT(int n) {
        var i = 2;
        while (n % i > 0) i++;
        return i == n;
    }


    private static int timMax(int a, int b, int c) {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        return max;
    }
}
