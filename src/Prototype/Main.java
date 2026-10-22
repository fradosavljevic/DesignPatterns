package Prototype;

public class Main {
    public static void main(String[] args) {
        CloudConfiguration database = new DatabaseServerConfig(8, 32, "CentOS");
        CloudConfiguration web = new WebServerConfig(2, 4, "Ubuntu");

        ConfigurationBuilder DatabaseBuilder = new ConfigurationBuilder(database);
        ConfigurationBuilder WebBuilder = new ConfigurationBuilder(web);

        CloudConfiguration D = DatabaseBuilder.makeConfiguration();
        D.showDetails();

        System.out.println("----------------------");

        CloudConfiguration W = WebBuilder.makeConfiguration();
        W.showDetails();
    }
}
