package Visitor;

public class ComputeNode implements InfrastructureElement {
    @Override
    public void accept(InfrastructureVisitor visitor) {
        visitor.visit(this);
    }
}
