package Bridge;

public interface CloudPlatform {
    void deployInstance(String instanceType);
    void terminateInstance(String instanceId);
}
