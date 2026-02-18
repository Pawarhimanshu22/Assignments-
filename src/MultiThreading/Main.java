package MultiThreading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();
        MultiThreadingDemo demo = new MultiThreadingDemo();
        Thread thread1 = new Thread(demo);
        Thread thread2 = new Thread(demo);
        Thread thread3 = new Thread(demo);
    }
}
