package State;

public class StoppedState implements ServerState {
    @Override
    public void handle(CloudServerContext context) {
        System.out.println("Server is STOPPED. Booting up server...");
        context.setState(new RunningState());
    }
}
