package Abstract_Factory;

public interface CloudFactory {
    Server createServer();
    Database createDatabase();
}
