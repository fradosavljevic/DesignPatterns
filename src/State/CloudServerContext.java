package State;

public class CloudServerContext {
    private ServerState state;

    public CloudServerContext(ServerState state) { this.state = state; }

    public void setState(ServerState state) { this.state = state; }

    public void request() { state.handle(this); }
}
