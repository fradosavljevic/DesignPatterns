package Mediator;

public interface CloudMediator {
    void notify(ServerColleague sender, String event);
}
