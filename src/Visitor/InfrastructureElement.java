package Visitor;

public interface InfrastructureElement {
    void accept(InfrastructureVisitor visitor);
}
