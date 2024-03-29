class Base1 {
    Base1() {
        System.out.println("I am a constructor!");
    }

    Base1(int x) {
        System.out.println("I am an overloaded constructor of base class with a value of x as : "+ x);
    }

}

class derived1 extends Base1 {
    derived1() {

        //super(0);
        System.out.println("I am a dervied class contructor!");
    }

    derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded contructor with the value of y as: " + y);
    }
}

class childofderived1 extends derived1 {
    childofderived1() {
        System.out.println("I am a child of derived class constructor!");
    }

    childofderived1(int x, int y, int z) {
        super( x,  y);
        System.out.println("I am an overloaded contructor of child of derived class with the value of z as: " + z);
    }
}

public class Constructor_in_inheritance {
    public static void main(String[] args) {
        //Base b = new Base();
       derived1 d = new derived1(14, 4);
        childofderived1 cd = new childofderived1(11, 14, 16);
    }
}
