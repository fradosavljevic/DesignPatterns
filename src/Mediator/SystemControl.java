package Mediator;

public class SystemControl implements CloudMediator {
    private ServerNode serverNode;
    private DatabaseNode databaseNode;
    private AlertSystem alertSystem;

    public void setServerNode(ServerNode serverNode) { this.serverNode = serverNode; }
    public void setDatabaseNode(DatabaseNode databaseNode) { this.databaseNode = databaseNode; }
    public void setAlertSystem(AlertSystem alertSystem) { this.alertSystem = alertSystem; }

    @Override
    public void notify(ServerColleague sender, String event) {
        if (event.equals("OVERLOAD")) {
            System.out.println("Mediator: Overload signal received. Starting an emergency procedure...");
            databaseNode.switchToReadOnly();
            alertSystem.sendAdminAlert();
        }
    }
}
