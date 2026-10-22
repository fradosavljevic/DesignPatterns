package Decorator;

public abstract class ServerDecorator implements CloudServer {
    protected CloudServer wrappedServer;

    public ServerDecorator(CloudServer server) {
        this.wrappedServer = server;
    }

    @Override
    public void deploy() {
        wrappedServer.deploy(); // Prosleđuje poziv unutrašnjem objektu
    }
}
