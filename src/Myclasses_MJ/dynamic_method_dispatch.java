package Myclasses_MJ;

class Phone {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void on() {
        System.out.println("turning On Phone...");
    }
}

class SmartPhone extends Phone {
    public void swagat() {
        System.out.println("Apka swagat hai!");
    }

    public void on() {
        System.out.println("Turning On SmartPhone...");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); Allowed
        // SmartPhone smobj = new SmartPhone(); Allowed
        Phone obj = new SmartPhone(); //Allowed
        // SmartPhone smobj = new Phone; // NOt Allowed
        obj.greet();
        obj.on();
        //obj.swagat(); // not Allowed.
    }
}
