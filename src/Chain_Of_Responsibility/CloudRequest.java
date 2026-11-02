package Chain_Of_Responsibility;

public class CloudRequest {
    private final String token;
    private final String ipAddress;
    private final boolean resourceAvailable;

    public CloudRequest(String token, String ipAddress, boolean resourceAvailable) {
        this.token = token;
        this.ipAddress = ipAddress;
        this.resourceAvailable = resourceAvailable;
    }

    public String getToken() { return token; }
    public String getIpAddress() { return ipAddress; }
    public boolean isResourceAvailable() { return resourceAvailable; }
}
