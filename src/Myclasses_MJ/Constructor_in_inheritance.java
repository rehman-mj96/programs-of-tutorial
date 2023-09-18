package Myclasses_MJ;
class Base {
    Base() {
        System.out.println("I am a constructor!");
    }

    Base(int x) {
        System.out.println("I am an overloaded constructor of base class with a value of x as : "+ x);
    }

}

class derived extends Base {
    derived() {

        //super(0);
        System.out.println("I am a dervied class contructor!");
    }

    derived(int x, int y) {
        super(x);
        System.out.println("I am an overloaded contructor with the value of y as: " + y);
    }
}

class childofderived extends derived {
    childofderived() {
        System.out.println("I am a child of derived class constructor!");
    }

    childofderived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded contructor of child of derived class with the value of z as: " + z);
    }
}

public class Constructor_in_inheritance {
    public static void main(String[] args) {
        //Base b = new Base();
       //derived d = new derived(14, 4);
        childofderived cd = new childofderived(11, 14, 16);
    }
}
