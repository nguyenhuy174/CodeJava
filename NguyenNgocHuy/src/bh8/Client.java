package bh8;

public class Client {
    public static void main(String[] args) {
        IGenerator r = new Galaxy("Galaxy Kinh Duong Vuong", "Tp HCM");
        IGenerator r2 = new Galaxy("Galaxy Tan Binh", "Tp HCM");
        EventArg p = new Film("Conan Movie");
        EventArg p1 = new Film("Doraemon Movie");
        IListener k1 = new Customer(1,"Long", 200000);
        IListener k2 = new Customer(2,"Tuan", 500000);
        IListener k3 = new Customer(3, "Binh", 0);
        k1.subscribe(r);
        k2.subscribe(r);
        k2.subscribe(r);
        r.onEvent(null, p);
    }
}
