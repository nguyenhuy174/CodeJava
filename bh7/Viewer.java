package bh7;

public class Viewer implements IListener {
    private final String ten;
    private int ma;

    public Viewer(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }


    @Override
    public boolean equals(Object obj) {
        return this.ma == ((Viewer) obj).ma;
    }



    @Override
    public void subscribe(IGenerator r) {
        r.them(this);
    }

    @Override
    public void response(Object from, EventArg e) {
        if (((Youtuber) from).getHang() == 1)
            if (((Video)e).getChuDe().toUpperCase().contains("CNTT"))
                System.out.println(this.ten + " vao xem ngay!");
            else
                System.out.println(this.ten + " ko xem");
        else
            System.out.println(this.ten + " ko xem");
    }
}
