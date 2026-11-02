package Composite;

import java.util.ArrayList;
import java.util.List;

public class RackComposite implements InfrastructureComponent {
    private final List<InfrastructureComponent> children = new ArrayList<>();
    private final String rackName;

    public RackComposite(String rackName) { this.rackName = rackName; }

    public void add(InfrastructureComponent component) { children.add(component); }

    @Override
    public void deploy() {
        System.out.println("Deploying Rack: " + rackName);
        for (InfrastructureComponent child : children) {
            child.deploy();
        }
    }
}
