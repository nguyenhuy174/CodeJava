package bh8;

public class Film extends EventArg{
    private String name;

    public Film(String ten) {
        this.name = ten;
    }

    public String getName() {
        return this.name;
    }
}
