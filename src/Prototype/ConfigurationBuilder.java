package Prototype;

public class ConfigurationBuilder {
    private CloudConfiguration prototype;

    public ConfigurationBuilder(CloudConfiguration target) {
        prototype = target;
    }

    public CloudConfiguration makeConfiguration() {
        return prototype.cloneConfig();
    }
}
