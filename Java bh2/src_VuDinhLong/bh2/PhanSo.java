package bh2;

public class PhanSo {
    private int mau;
    private int tu;

    public PhanSo() {
        new PhanSo(0,1);
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        this.rutGon();
    }

    public static PhanSo cong(PhanSo p, PhanSo q) {
        return p.cong(q);
    }

    private PhanSo rutGon() {
        var u = ulcn(this.tu, this.mau);
        this.tu = this.tu / u;
        this.mau /= u;
        return this;
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }

    private int ulcn(int a, int b) {
        while (a * b > 0)
            if (a > b) a = a - b;
            else b = b - a;
        return a + b;
    }

    public PhanSo cong(PhanSo q) {
        PhanSo tong = new PhanSo();
        tong.tu = this.tu * q.mau + this.mau * q.tu;
        tong.mau = this.mau * q.mau;
        return tong.rutGon();
    }

    public PhanSo nhan(PhanSo q) {
        var kq = new PhanSo();
        kq.tu=this.tu*q.tu;
        kq.mau=this.mau*q.mau;
        return kq.rutGon();
    }
}
