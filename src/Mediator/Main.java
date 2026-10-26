package Mediator;

public class Main {
    public static void main(String[] args) {
        SystemControl mediator = new SystemControl();

        ServerNode server = new ServerNode(mediator);
        DatabaseNode database = new DatabaseNode(mediator);
        AlertSystem alert = new AlertSystem(mediator);

        mediator.setServerNode(server);
        mediator.setDatabaseNode(database);
        mediator.setAlertSystem(alert);

        server.overload();
    }
}
