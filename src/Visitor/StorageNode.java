package Visitor;

public class StorageNode implements InfrastructureElement {
    @Override
    public void accept(InfrastructureVisitor visitor) {
        visitor.visit(this);
    }
}
