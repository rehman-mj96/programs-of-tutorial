package Myclasses_MJ;

interface Bicycle {
    public void speedUp(int increament);

    public void applyBreaks(int decreament);

}

interface BlowHorn {
    void BlowHornk3g();

    void BlowHornMhn();

}

class AvonCycle implements Bicycle, BlowHorn {
    
    public int speed = 7;
    
    @Override
    public void speedUp(int increament) {
        speed += increament; 
       System.out.println("Speeding upto "+ speed); 

        
    }

    @Override
    public void applyBreaks(int decreament) {
        speed -= decreament;
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