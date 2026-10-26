package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        CloudFactory factory = new AwsFactory();

        Server server = factory.createServer();
        Database database = factory.createDatabase();

        server.deploy();
        database.connect();
    }
}
