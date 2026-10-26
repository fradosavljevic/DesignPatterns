package Bridge;

public class Main {
    public static void main(String[] args) {
        CloudPlatform aws = new AwsPlatform();
        Server awsServer = new AdvancedServer(aws);
        awsServer.provision("t3.xlarge");
        awsServer.shutdown("i-0123456789abcdef0");

        System.out.println("-------------------");

        CloudPlatform azure = new AzurePlatform();
        Server azureServer = new AdvancedServer(azure);
        azureServer.provision("Standard_D4s_v3");
        azureServer.shutdown("vm-azure-98765");
    }
}
