package Abstract_Factory;

public class AwsDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to AWS RDS database...");
    }
}
