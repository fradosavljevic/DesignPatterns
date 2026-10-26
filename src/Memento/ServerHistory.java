package Memento;

import java.util.Stack;

public class ServerHistory {
    private final Stack<ServerMemento> history = new Stack<>();

    public void push(ServerMemento memento) {
        history.push(memento);
    }

    public ServerMemento pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
