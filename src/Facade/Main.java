package Facade;

public class Main {
    public static void main(String[] args) {
        // The client interacts only with the Facade (Computer), keeping things clean
        Computer computer = new Computer();

        computer.startComputer();

        System.out.println("\n[Computer is running your tasks...]\n");

        computer.shutdownComputer();
    }
}
