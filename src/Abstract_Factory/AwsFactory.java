package Abstract_Factory;

public class AwsFactory implements CloudFactory {
    @Override
    public Server createServer() {
        return new AwsServer();
    }

    @Override
    public Database createDatabase() {
        return new AwsDatabase();
    }
}