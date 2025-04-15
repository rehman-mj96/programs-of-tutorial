package Myclasses_MJ;

interface Bicycle {
    void speedUp(int increment);

    void applyBreaks(int decrement);

}

interface BlowHorn {
    void BlowHornk3g();

    void BlowHornMhn();

}

class AvonCycle implements Bicycle, BlowHorn {

    public int speed = 7;

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speeding up to " + speed);


    }

    @Override
    public void applyBreaks(int decrement) {
        speed -= decrement;
        System.out.println("applying breaks to decrease the speed to " + speed);

    }

    @Override
    public void BlowHornk3g() {
        System.out.println("Kabhi khushi Kabhi gum pee pee pee");
    }

    @Override
    public void BlowHornMhn() {
        System.out.println("Main hoon na poo poo poo poo");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle Bcl = new AvonCycle();
        Bcl.speedUp(5);
        Bcl.applyBreaks(3);
        Bcl.BlowHornk3g();
        Bcl.BlowHornMhn();
    }
}