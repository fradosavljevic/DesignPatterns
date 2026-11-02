package Visitor;

public class Main {
    static void main(String[] args) {
        InfrastructureElement[] elements = {
                new ComputeNode(),
                new StorageNode()
        };

        InfrastructureVisitor healthCheckVisitor = new HealthCheckVisitor();

        for (InfrastructureElement element : elements) {
            element.accept(healthCheckVisitor);
        }
    }
}
