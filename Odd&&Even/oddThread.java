package Practice;

public class oddThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
