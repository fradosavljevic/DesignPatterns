package Chain_Of_Responsibility;

public class AuthHandler extends RequestHandler {
    @Override
    public void handle(CloudRequest request) {
        if (request.getToken() != null && request.getToken().equals("VALID_ADMIN_TOKEN")) {
            System.out.println("AuthHandler: Authentication passed.");
            if (nextHandler != null) nextHandler.handle(request);
        } else {
            System.out.println("AuthHandler: Authentication failed!");
        }
    }
}
