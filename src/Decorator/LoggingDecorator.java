package Decorator;

public class LoggingDecorator extends ServerDecorator {
    public LoggingDecorator(CloudServer server) {
        super(server);
    }

    @Override
    public void deploy() {
        super.deploy();
        System.out.println("Logging deployment event to central server.");
    }
}

