package Builder;

public class EnterpriseServerBuilder implements ServerBuilder {
    private CloudServer server = new CloudServer();

    @Override
    public void buildCpu() {
        server.setCpu("AMD EPYC 64-Core");
    }

    @Override
    public void buildRam() {
        server.setRamGb(128);
    }

    @Override
    public void buildFirewall() {
        server.setHasFirewall(true);
    }

    @Override
    public CloudServer getResult() {
        return this.server;
    }
}
