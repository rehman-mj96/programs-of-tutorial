package Myclasses_MJ;

class MyThread1 extends Thread {
@Override
    public void run() {
        int i=0;
        while (i < 4000) {
            System.out.println("MyThread1 is Running... "+ i);
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("MyThread2 is Running... "+ i);
            System.out.println("I am sad");
            i++;
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();   
    }      
}
