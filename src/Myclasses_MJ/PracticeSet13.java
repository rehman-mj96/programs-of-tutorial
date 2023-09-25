package Myclasses_MJ;


class MyNewThr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            try{
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good morning...");
            i++;
        }
    }
}
class MyNewThr2 extends Thread {
    public void run() {
        int i = 0;
        while (i<4000) {
            try{
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome...");
            i++;
        }
    }
}
public class PracticeSet13 {
    public static void main(String[] args) {
        MyNewThr1 p = new MyNewThr1();
        MyNewThr2 p2 = new MyNewThr2();
        p.setPriority(6);
        p2.setPriority(9);
        System.out.println(p.getPriority());
        System.out.println(p2.getPriority());
        p.start();
        p2.start();
        
    }
}
