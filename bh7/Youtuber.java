package bh7;

import java.util.*;

public class Youtuber implements IGenerator {
    private final String ten;
    private List<IListener> ds = null;
    private int hang;

    public Youtuber(String ten, int hang) {
        this.hang = hang;
        this.ten = ten;
        this.ds = new ArrayList<IListener>();
    }


    @Override
    public void onCoPhimMoi(EventArg e) {

    }

    public void them(Viewer viewer) {
        if (!this.tim(viewer))
            this.ds.add(viewer);
    }

    private boolean tim(IListener listener) {
        for (var v : this.ds)
            if (listener.equals(v)) return true;
        return false;
    }

    public int getHang() {
        return this.hang;//rank
    }

    @Override
    public void them(IListener listener) {
        if (!this.tim(listener))
            this.ds.add(listener);
    }

    @Override
    public void onNewVideo(EventArg e) {
        for (var v : this.ds) v.response(this, e);
    }
}
