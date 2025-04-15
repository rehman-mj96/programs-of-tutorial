package Myclasses_MJ;

class My_thread_2 implements Runnable {
    public My_thread_2() {
        System.out.println("Thank You...");

    }

    public void run() {
        System.out.println("This is the run method of My_thread_2");
    }

}

class My_thread_1 extends Thread {
    public My_thread_1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thank you...");
    }
}

public class Constructor_in_Thread {
    public static void main(String[] args) {

        My_thread_1 t1 = new My_thread_1("Mujahid");
        t1.start();

        My_thread_1 t2 = new My_thread_1("Ajmal");
            t2.start();
            System.out.println("the id of this Myth is " + t2.threadId());
            System.out.println("The name of this Mythr is " + t2.getName());
        My_thread_2 tr1 = new My_thread_2();
        Thread rt1 = new Thread(tr1, "Saquib");
        rt1.start();
        System.out.println("The name of the Runnable Thread is " + rt1.getName());

    }
}
