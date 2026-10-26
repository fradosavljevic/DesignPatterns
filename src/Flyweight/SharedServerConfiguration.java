package Flyweight;

public class SharedServerConfiguration implements ServerConfiguration {
    private final String cpu;
    private final int ramGb;
    private final String os;

    public SharedServerConfiguration(String cpu, int ramGb, String os) {
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.os = os;
    }

    @Override
    public void deploy(String ipAddress, int rackNumber) {
        System.out.println("Deploying [CPU=" + cpu + ", RAM=" + ramGb + "GB, OS=" + os +
                "] at IP: " + ipAddress + ", Rack: " + rackNumber);
    }
}
