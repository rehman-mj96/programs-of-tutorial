abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("Refill");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();

}

class Monkey {
    void jumping() {
        System.out.println("Jumping");

    }

    void bite() {
        System.out.println("biting...");
    }
}

class Human extends Monkey implements BasicAnimal{
    void speak() {
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Practice_Set {
    public static void main(String[] args) {
        Human Hm = new Human();
        Hm.bite();
        Hm.eat();
        Hm.sleep();
        Hm.jumping();
    }
}
