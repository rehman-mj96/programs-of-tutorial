package Myclasses_MJ;

class Mythr2 implements Runnable {
    public void Mythr2(Runnable r) {
        System.out.println("Thank You...");

    }

    public void run() {
        System.out.println("This is the run method of Mythr2");
    }

}

class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("Thank you...");
    }
}

public class Constructor_in_Thread {
    public static void main(String[] args) {

        Mythr1 t1 = new Mythr1("Mujahid");
        // t1.start();

        Mythr1 t2 = new Mythr1("Ajmal");
        /*
         * t2.start();
         * System.out.println("the id of this Mythr is " + t2.getId());
         * System.out.println("The name of this Mythr is " + t2.getName());
         */
        Mythr2 tr1 = new Mythr2();
        Thread rt1 = new Thread(tr1, "Saquib");
        rt1.start();
        System.out.println("The name of the Runnable Thread is " + rt1.getName());

    }
}
