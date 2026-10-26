package Flyweight;

public class Main {
    public static void main(String[] args) {
        ServerConfiguration config1 = ServerConfigurationFactory.getConfiguration("Intel Xeon", 64, "Ubuntu 22.04");
        config1.deploy("192.168.1.10", 5);

        ServerConfiguration config2 = ServerConfigurationFactory.getConfiguration("Intel Xeon", 64, "Ubuntu 22.04");
        config2.deploy("192.168.1.11", 5);

        ServerConfiguration config3 = ServerConfigurationFactory.getConfiguration("AMD EPYC", 128, "RHEL 9");
        config3.deploy("10.0.0.15", 2);
    }
}
