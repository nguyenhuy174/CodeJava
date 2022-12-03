package bh10;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Thread l1 = new Lop("CN20A");
        Thread l2 = new Lop("CN20B");
        l1.start();
        l2.start();
    }

    private static void nhieuThreadHD() {
        Thread t1 = new MyThead();
        Thread t2 = new Thread(new OtherThred());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }

    private static void cach2() {
        Thread t = new Thread(new OtherThred());
        t.start();
    }

    private static void cach1() {
        Thread t = new MyThead();
        t.start();
    }

    private static void cach3() {
        Thread t = new Thread(new Runnable() {//tao ra thread
            @Override
            public void run() {
                System.out.println("thread dang chay");
            }
        });
        //thuc thi thread
        t.start();
    }
}
