package Bridge;

public abstract class Server {
    protected CloudPlatform platform;

    public Server(CloudPlatform platform) {
        this.platform = platform;
    }

    public abstract void provision(String configuration);
    public abstract void shutdown(String instanceId);
}
