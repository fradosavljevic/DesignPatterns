package Builder;

public class CloudServer {
    private String cpu;
    private int ramGb;
    private boolean hasFirewall;

    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setRamGb(int ramGb) { this.ramGb = ramGb; }
    public void setHasFirewall(boolean hasFirewall) { this.hasFirewall = hasFirewall; }

    @Override
    public String toString() {
        return "CloudServer [CPU=" + cpu + ", RAM=" + ramGb + "GB, Firewall=" + hasFirewall + "]";
    }
}
