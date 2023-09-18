package Myclasses_MJ;

class Base {
    public int x;

    public void setX(int i) {
        x = i;
    }

    public int getX() {
        return x;
    }

}

class derived extends Base {
    public int y;

    public void setY(int w) {
        y = w;
    }
    public int getY(){
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        derived d = new derived();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(9);
        System.out.println(d.getY());
    }
}
