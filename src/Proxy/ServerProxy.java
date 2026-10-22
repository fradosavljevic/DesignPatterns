package Proxy;

public class ServerProxy implements Server {
    private RealServer server;

    public ServerProxy(RealServer server) {
        this.server = server;
    }

    @Override
    public void connect(String userRole) {
        if(userRole.equals("ADMIN")) {
            server.connect(userRole);
        } else {
            System.out.println("Access Denied! Only admins can access the production server. [SERVER DIDN'T LOAD]");
        }
    }
}
