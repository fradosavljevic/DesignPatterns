package Mediator;

public class AlertSystem extends ServerColleague {
    public AlertSystem(CloudMediator mediator) {
        super(mediator);
    }

    public void sendAdminAlert() {
        System.out.println("AlertSystem: Emergency alert sent to administrators!");
    }
}
