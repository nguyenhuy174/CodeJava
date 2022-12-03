package bh7;

import java.util.ArrayList;
import java.util.List;

public class Rap implements IGenerator {
    private final String ten;
    private List<IListener> ds = null;

    public Rap(String ten) {
        this.ds = new ArrayList<IListener>();
        this.ten = ten;
    }

    @Override
    public void them(IListener listener) {
        if (!this.tim(listener))
            this.ds.add(listener);
    }

    @Override
    public void onNewVideo(EventArg e) {

    }

    @Override
    public void onCoPhimMoi(EventArg e) {

    }

    private boolean tim(IListener listener) {
        for (var l : this.ds)
            if (l.equals(listener)) return true;
        return false;
    }
}
