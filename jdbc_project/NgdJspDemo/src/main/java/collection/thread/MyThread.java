package collection.thread;

public class MyThread extends Thread {
    int t = 1;
    /**
     * 普通成员方法
     * 供用户编写方法用
     */
    @Override
    public void run() {
        synchronized (this) {
            for (; t < 100; ) {
//            System.out.println(Thread.currentThread()+":"+i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                t++;
                System.out.println("第" + t + "张票已经售出");
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        System.out.println("=====================");
//        myThread1.run();
//        myThread2.run();
//        myThread3.run();
        System.out.println("=====================");
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
