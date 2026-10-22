package Observer;

public class EmailObserver implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Email sent to admin: Server status -> " + status);
    }
}
