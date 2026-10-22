package Prototype;

public class DatabaseServerConfig implements CloudConfiguration {
    private int cpu;
    private int ram;
    private String os;

    public DatabaseServerConfig(int cpu, int ram, String os) {
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
    }

    public DatabaseServerConfig(DatabaseServerConfig target) {
        cpu = target.cpu;
        ram = target.ram;
        os = target.os;
    }

    @Override
    public CloudConfiguration cloneConfig() {
        return new DatabaseServerConfig(this);
    }

    @Override
    public void showDetails() {
        System.out.println("DatabaseServerConfig:");
        System.out.println("CPU: " + cpu + ", RAM: " + ram + ", OS: " + os);
    }
}
