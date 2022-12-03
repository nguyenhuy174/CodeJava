package bh10;

public class MyThead extends Thread {
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setName("my thread");
        System.out.println(this.getName());
    }
}
