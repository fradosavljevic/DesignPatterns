package Bridge;

public class AdvancedServer extends Server {
    public AdvancedServer(CloudPlatform platform) {
        super(platform);
    }

    @Override
    public void provision(String configuration) {
        System.out.println("AdvancedServer: Running pre-flight security checks...");
        platform.deployInstance(configuration);
    }

    @Override
    public void shutdown(String instanceId) {
        System.out.println("AdvancedServer: Backing up state before shutdown...");
        platform.terminateInstance(instanceId);
    }
}
