package Facade;

public class CPU {
    private int clockSpeed;

    public CPU(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public void halt() {
        System.out.println("CPU (" + clockSpeed + "GHz): Halting processor and preparing...");
    }

    public void jump(long position) {
        System.out.println("CPU: Jumping to memory address " + position + "...");
    }

    public void execute() {
        System.out.println("CPU: Executing instructions...");
    }
}
