package Mediator;

public abstract class ServerColleague {
    protected CloudMediator mediator;

    public ServerColleague(CloudMediator mediator) {
        this.mediator = mediator;
    }
}
