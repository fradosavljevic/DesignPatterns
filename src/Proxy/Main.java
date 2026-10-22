package Proxy;

public class Main {
    public static void main(String[] args) {
        RealServer server = new RealServer();
        ServerProxy proxy = new ServerProxy(server);

        proxy.connect("ADMIN"); // We load the server
        proxy.connect("USER"); // We don't load the server
    }
}
