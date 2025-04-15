package Myclasses_MJ;

interface Camera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4kVideos() {
        greet();
        System.out.println("Recording 4k Video...");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectToNetworks(String network);

}

class CellPhone {
    void callNumber(int number) {
        System.out.println("Calling... " + number);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends CellPhone implements Wifi, Camera {
    @Override
    public void takeSnap() {
        System.out.println("Takind Snap ...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of Networks");
        String[] networkList = {"realme", "Saqib", "Infinix"};
        return networkList;
    }

    @Override
    public void connectToNetworks(String network) {
        System.out.println("Connecting to network " + network);
    }

    @Override
    public void pickCall() {
        System.out.println("Connecting to the Call");
    }

    @Override
    public void callNumber(int number) {
        System.out.println("Calling... " + number);
    }
}

public class Example_of_Interfaces {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for (String Item : ar) {
            ms.connectToNetworks(Item);
        }
        ms.callNumber(77468330);
        ms.record4kVideos();
    }
}
