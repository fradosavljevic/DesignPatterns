package Observer;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Observer> observers = new ArrayList<>();
    private String status = "OK";

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Server status changed to: " + status);
        notifyObservers();
    }
}
