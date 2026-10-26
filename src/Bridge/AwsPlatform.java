package Bridge;

public class AwsPlatform implements CloudPlatform {
    @Override
    public void deployInstance(String instanceType) {
        System.out.println("AWS: Deploying EC2 instance of type " + instanceType);
    }

    @Override
    public void terminateInstance(String instanceId) {
        System.out.println("AWS: Terminating EC2 instance " + instanceId);
    }
}
