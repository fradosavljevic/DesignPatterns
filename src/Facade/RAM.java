package Facade;

public class RAM {
    public void load(long position, String data) {
        System.out.println("RAM: Loading data to address " + position + " [" + data + "]...");
    }
}
