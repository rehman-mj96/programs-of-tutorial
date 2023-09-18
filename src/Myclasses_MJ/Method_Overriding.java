package Myclasses_MJ;

class A {
    int x;

    public void harry() {
        System.out.println("I am harry");
    }
    public void meth1() {
        System.out.println("I am method1 of class A");
    }

}

class B extends A {
    @Override
    public void meth1() {
        System.out.println("I am method1 of class B!");
    }

    public int getX() {
        return x;
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        A a = new B();
        //a.meth1();
        
        a.harry();
        a.meth1();
    }
}
