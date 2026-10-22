package Decorator;

public class SecurityDecorator extends ServerDecorator {
    public SecurityDecorator(CloudServer server) {
        super(server);
    }

    @Override
    public void deploy() {
        super.deploy();
        System.out.println("Applying firewall rules and SSL...");
    }
}
