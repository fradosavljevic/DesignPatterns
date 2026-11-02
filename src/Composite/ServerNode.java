package Composite;

public class ServerNode implements InfrastructureComponent {
    private final String name;

    public ServerNode(String name) { this.name = name; }

    @Override
    public void deploy() {
        System.out.println("Deploying Server Node: " + name);
    }
}
