package Builder;

public class CloudArchitect {
    private ServerBuilder builder;

    public CloudArchitect(ServerBuilder builder) {
        this.builder = builder;
    }

    public void constructProductionServer() {
        builder.buildCpu();
        builder.buildRam();
        builder.buildFirewall();
    }

    public void constructTestServer() {
        builder.buildCpu();
        builder.buildRam();
    }
}
