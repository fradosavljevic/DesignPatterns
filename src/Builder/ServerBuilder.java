package Builder;

public interface ServerBuilder {
    void buildCpu();
    void buildRam();
    void buildFirewall();
    CloudServer getResult();
}
