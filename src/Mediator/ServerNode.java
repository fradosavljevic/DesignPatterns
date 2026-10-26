package Mediator;

public class ServerNode extends ServerColleague {
    public ServerNode(CloudMediator mediator) {
        super(mediator);
    }

    public void overload() {
        System.out.println("ServerNode: Warning! Server is overloaded!");
        mediator.notify(this, "OVERLOAD");
    }
}
