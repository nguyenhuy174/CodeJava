package bh7;

public interface IGenerator {
    void them(IListener listener);

    void onNewVideo(EventArg video);

    void onCoPhimMoi(EventArg phim);
}
