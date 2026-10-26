package Abstract_Factory;

public class AzureServer implements Server {
    @Override
    public void deploy() {
        System.out.println("Deploying server on Azure Virtual Machines...");
    }
}
