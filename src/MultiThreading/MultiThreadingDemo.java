package MultiThreading;

public class MultiThreadingDemo implements Runnable{
    private int number;
    public MultiThreadingDemo() {
        this.number = number;
    }
    @Override
    public void run() {
        for(int i = 1; i < 10; i++)
        {
            int result = number * i;
            System.out.println(Thread.currentThread().getName() + " : " + number + " x " + i + " = " + result);
        }

    }
}
