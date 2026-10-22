package Proxy;

public class RealServer implements Server {
    @Override
    public void connect(String userRole) {
        System.out.println("Connecting to the heavy production server infrastructure... [SERVER LOADING]");
    }
}
