package bh7;

public class Client {
    public static void main(String[] args) {
        IGenerator r = new Rap("galaxy");
        IGenerator x = new Youtuber("Tuan", 1);
        IListener y = new Viewer(1, "Binh");
        IListener y2 = new Viewer(2, "Lan");
        IListener z = new Viewer(3, "Toan");
        IListener g = new GiangVien("Long");
        IListener s = new SinhVien("Hieu");
        g.subscribe(r);
        y.subscribe(x);
        y.subscribe(x);
        y2.subscribe(x);
        //...
        x.onNewVideo(new Video("chu de cntt"));
        r.onCoPhimMoi(new Phim("Black Adam"));
    }
}
