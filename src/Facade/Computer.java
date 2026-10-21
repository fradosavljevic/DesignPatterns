package Facade;

public class Computer {
    private CPU computerCPU;
    private RAM computerRAM;
    private SSD computerSSD;

    public Computer() {
        computerCPU = new CPU(3); // e.g., 3 GHz
        computerRAM = new RAM();
        computerSSD = new SSD();
    }

    // THE FACADE METHOD: The client doesn't need to know about CPU, RAM, or SSD details
    public void startComputer() {
        System.out.println("--- STARTING COMPUTER ---");
        computerCPU.halt();
        String bootData = computerSSD.read(0, 1024);
        computerRAM.load(0, bootData);
        computerCPU.jump(0);
        computerCPU.execute();
        System.out.println("--- COMPUTER IS READY ---");
    }

    public void shutdownComputer() {
        System.out.println("--- SHUTTING DOWN COMPUTER ---");
    }
}
