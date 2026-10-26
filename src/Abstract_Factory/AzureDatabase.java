package Abstract_Factory;

public class AzureDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to Azure SQL Database...");
    }
}
