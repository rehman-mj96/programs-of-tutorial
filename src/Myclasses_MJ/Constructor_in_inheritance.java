package Myclasses_MJ;

class Base1 {
    Base1() {
        System.out.println("I am a constructor!");
    }

    Base1(int x) {
        System.out.println("I am an overloaded constructor of base class with a value of x as : " + x);
    }

}

class derived1 extends Base1 {
    derived1() {
//        super(2);
        System.out.println("I am a derived class constructor!");
    }

    derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of the derived1 class with the value of y as: " + y);
    }
}

class childofderived1 extends derived1 {
    childofderived1() {
        System.out.println("I am a child of derived class constructor!");
    }

    childofderived1(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of child of derived class with the value of z as: " + z);
    }
// Demonstrates constructor inheritance in Java with base, derived, and child classes.
}

public class Constructor_in_inheritance {
    public static void main(String[] args) {
        new Base();
        new derived1(9,13);
        new childofderived1();
        new childofderived1(11, 14, 16);
    }
}
