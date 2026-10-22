package Decorator;

public class BasicCloudServer implements CloudServer {
    @Override
    public void deploy() {
        System.out.println("Deploying basic cloud server...");
    }
}
