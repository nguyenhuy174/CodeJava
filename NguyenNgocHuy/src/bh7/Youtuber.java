package bh7;

import java.util.ArrayList;

import java.util.List;

public class Youtuber implements IGenerator {

	private final String ten;
	private int hang;

	private List<IListener> ds = null;

	public Youtuber(String ten, int hang) {
		this.hang = hang;
		this.ten = ten;
		this.ds = new ArrayList<IListener>();
	}

	public void them(Viewer viewer) {
		if (!this.tim(viewer))
			this.ds.add(viewer);
	}

	private boolean tim(IListener listener) {
		for (var v : this.ds)
			if (listener.equals(v))
				return true;
		return false;
	}

	public int getHang() {
		return this.hang;
	}

	@Override
	public void onNewVideo(EventArg e) {
		for (var v : this.ds)
			v.response(this, e);
	}

	@Override
	public void onCoPhimMoi(EventArg e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void them(IListener listener) {
		if (!this.tim(listener))
			this.ds.add(listener);
	}
}
