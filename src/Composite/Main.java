package Composite;

public class Main {
    static void main(String[] args) {
        RackComposite rackA = new RackComposite("Rack-A");
        rackA.add(new ServerNode("Server-01"));
        rackA.add(new ServerNode("Server-02"));

        RackComposite dataCenter = new RackComposite("DataCenter-Primary");
        dataCenter.add(rackA);
        dataCenter.add(new ServerNode("Server-Standalone"));

        dataCenter.deploy();
    }
}
