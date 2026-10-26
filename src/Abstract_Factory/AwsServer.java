package Abstract_Factory;

public class AwsServer implements Server {
    @Override
    public void deploy() {
        System.out.println("Deploying server on AWS EC2...");
    }
}
