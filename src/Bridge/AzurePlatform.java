package Bridge;

public class AzurePlatform implements CloudPlatform {
    @Override
    public void deployInstance(String instanceType) {
        System.out.println("Azure: Deploying Virtual Machine of type " + instanceType);
    }

    @Override
    public void terminateInstance(String instanceId) {
        System.out.println("Azure: Terminating Virtual Machine " + instanceId);
    }
}
