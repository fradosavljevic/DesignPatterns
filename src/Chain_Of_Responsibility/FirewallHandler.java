package Chain_Of_Responsibility;

public class FirewallHandler extends RequestHandler {
    @Override
    public void handle(CloudRequest request) {
        if (!request.getIpAddress().equals("10.0.0.666")) {
            System.out.println("FirewallHandler: IP address allowed.");
            if (nextHandler != null) nextHandler.handle(request);
        } else {
            System.out.println("FirewallHandler: IP address blocked!");
        }
    }
}
