package Chain_Of_Responsibility;

public class Main {
    static void main(String[] args) {
        RequestHandler authHandler = new AuthHandler();
        RequestHandler firewallHandler = new FirewallHandler();

        authHandler.setNext(firewallHandler);

        CloudRequest validRequest = new CloudRequest("VALID_ADMIN_TOKEN", "192.168.1.50", true);
        authHandler.handle(validRequest);
    }
}
