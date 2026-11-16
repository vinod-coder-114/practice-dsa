package design_patterns;

import java.util.concurrent.Callable;

public class ControllerClass {
    public static void main(String[] args) {
//        Runnable task = () -> {
//            Singleton instance = Singleton.createInstance(5);
//            System.out.println(instance.a);
//        };
//
//        Thread t1 = new Thread(task, "Thread-1");
//        Thread t2 = new Thread(task, "Thread-2");
//
//        t1.start();
//        t2.start();

        Thread t1 = new Thread(() -> {
            Singleton s = Singleton.createInstance(5);
            System.out.println(s.a);
            System.out.println("Thread-1 has been executed");
        });

        Thread t2 = new Thread(() -> {
            Singleton s2 = Singleton.createInstance(10);
            System.out.println(s2.a);
            System.out.println("Thread-2 has been executed");
        });

        t1.start();
        t2.start();

    }
}
