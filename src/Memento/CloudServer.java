package Memento;

public class CloudServer {
    private String cpu;
    private int ramGb;
    private boolean hasFirewall;

    public void setState(String cpu, int ramGb, boolean hasFirewall) {
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.hasFirewall = hasFirewall;
    }

    public ServerMemento saveState() {
        return new ServerMemento(cpu, ramGb, hasFirewall);
    }

    public void restoreState(ServerMemento memento) {
        this.cpu = memento.getCpu();
        this.ramGb = memento.getRamGb();
        this.hasFirewall = memento.isHasFirewall();
    }

    @Override
    public String toString() {
        return "CloudServer [CPU=" + cpu + ", RAM=" + ramGb + "GB, Firewall=" + hasFirewall + "]";
    }
}
