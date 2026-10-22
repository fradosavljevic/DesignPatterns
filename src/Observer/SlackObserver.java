package Observer;

public class SlackObserver implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Slack alert: Server alarm [ " + status + " ]");
    }
}
