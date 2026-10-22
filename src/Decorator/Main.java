package Decorator;

public class Main {
    public static void main(String[] args) {
        CloudServer server = new BasicCloudServer();
        CloudServer secureServer = new SecurityDecorator(server);
        CloudServer fullyLoadedServer = new LoggingDecorator(secureServer);

        fullyLoadedServer.deploy();
    }
}
