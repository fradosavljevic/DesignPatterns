package Visitor;

public class HealthCheckVisitor implements InfrastructureVisitor {
    @Override
    public void visit(ComputeNode node) {
        System.out.println("HealthCheck: Checking CPU and memory limits on ComputeNode.");
    }

    @Override
    public void visit(StorageNode node) {
        System.out.println("HealthCheck: Checking disk space and SMART status on StorageNode.");
    }
}
