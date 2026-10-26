package Abstract_Factory;

public class AzureFactory implements CloudFactory {
    @Override
    public Server createServer() {
        return new AzureServer();
    }

    @Override
    public Database createDatabase() {
        return new AzureDatabase();
    }
}
