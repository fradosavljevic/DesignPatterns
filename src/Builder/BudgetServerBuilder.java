package Builder;

public class BudgetServerBuilder implements ServerBuilder {
    private CloudServer server = new CloudServer();

    @Override
    public void buildCpu() {
        server.setCpu("Intel Core i3 4-Core");
    }

    @Override
    public void buildRam() {
        server.setRamGb(8);
    }

    @Override
    public void buildFirewall() {
        server.setHasFirewall(false);
    }

    @Override
    public CloudServer getResult() {
        return this.server;
    }
}
