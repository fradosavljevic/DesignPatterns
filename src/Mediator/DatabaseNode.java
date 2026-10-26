package Mediator;

public class DatabaseNode extends ServerColleague {
    public DatabaseNode(CloudMediator mediator) {
        super(mediator);
    }

    public void switchToReadOnly() {
        System.out.println("DatabaseNode: Switching database to READ-ONLY mode.");
    }
}
