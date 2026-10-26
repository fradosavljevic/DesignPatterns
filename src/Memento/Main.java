package Memento;

public class Main {
    public static void main(String[] args) {
        CloudServer server = new CloudServer();
        ServerHistory history = new ServerHistory();

        server.setState("Intel Xeon", 32, false);
        System.out.println("Initial State: " + server);

        history.push(server.saveState());

        server.setState("AMD EPYC", 64, true);
        System.out.println("Modified State: " + server);

        ServerMemento previousState = history.pop();
        if (previousState != null) {
            server.restoreState(previousState);
        }

        System.out.println("Restored State: " + server);
    }
}
