package threads;

public class SyncronizedMethod extends Thread{
    public void run(){
        print();
    }

    public synchronized void print(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " число: " + i);
        }
    }

    public static void main(String[] args) {
        new SyncronizedMethod().start();
        new SyncronizedMethod().start();
    }
}
