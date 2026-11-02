package State;

public class RunningState implements ServerState {
    @Override
    public void handle(CloudServerContext context) {
        System.out.println("Server is RUNNING. Processing incoming cloud requests.");
        context.setState(new StoppedState());
    }
}
