package collection.thread;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable, "窗口1");
        thread1.start();
        Thread thread2 = new Thread(myRunnable, "窗口2");
        thread2.start();
        Thread thread3 = new Thread(myRunnable, "窗口3");
        thread3.start();
    }
}
