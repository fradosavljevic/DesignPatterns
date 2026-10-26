package Memento;

public class ServerMemento {
    private final String cpu;
    private final int ramGb;
    private final boolean hasFirewall;

    public ServerMemento(String cpu, int ramGb, boolean hasFirewall) {
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.hasFirewall = hasFirewall;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamGb() {
        return ramGb;
    }

    public boolean isHasFirewall() {
        return hasFirewall;
    }
}
