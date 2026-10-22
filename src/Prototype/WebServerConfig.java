package Prototype;

public class WebServerConfig implements CloudConfiguration {
    private int cpu;
    private int ram;
    private String os;

    public WebServerConfig(int cpu, int ram, String os) {
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
    }

    public WebServerConfig(WebServerConfig target) {
        cpu = target.cpu;
        ram = target.ram;
        os = target.os;
    }

    @Override
    public CloudConfiguration cloneConfig() {
        return new WebServerConfig(this);
    }

    @Override
    public void showDetails() {
        System.out.println("WebServerConfig:");
        System.out.println("CPU: " + cpu + ", RAM: " + ram + ", OS: " + os);
    }
}
