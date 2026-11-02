package Visitor;

public interface InfrastructureVisitor {
    void visit(ComputeNode node);
    void visit(StorageNode node);
}
