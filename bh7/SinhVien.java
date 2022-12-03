package bh7;

public class SinhVien implements IListener {
    private final String ten;

    public SinhVien(String ten) {
        this.ten = ten;
    }

    @Override
    public void subscribe(IGenerator r) {
        r.them(this);
    }

    @Override
    public void response(Object from, EventArg e) {

    }
}
