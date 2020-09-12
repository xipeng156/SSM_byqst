package collection.thread;

public class MyRunnable implements Runnable {
    private int count = 100;
    @Override
    public void run() {
//        synchronized (this){
            while (this.count>0) {
//                count--;
                System.out.println(Thread.currentThread().getName()+"还剩下"+(this.count--)+"张");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println("第"+(100-count)+"张票已经卖出");
//            }
        }
    }
}
