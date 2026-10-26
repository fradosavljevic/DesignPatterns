package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ServerConfigurationFactory {
    private static final Map<String, ServerConfiguration> cache = new HashMap<>();

    public static ServerConfiguration getConfiguration(String cpu, int ramGb, String os) {
        String key = cpu + "-" + ramGb + "-" + os;

        if (!cache.containsKey(key)) {
            cache.put(key, new SharedServerConfiguration(cpu, ramGb, os));
            System.out.println("Factory: Created new shared configuration instance for key: " + key);
        } else {
            System.out.println("Factory: Reusing existing configuration instance for key: " + key);
        }

        return cache.get(key);
    }
}
