package Observer;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        Observer email = new EmailObserver();
        Observer slack = new SlackObserver();

        server.addObserver(email);
        server.addObserver(slack);

        server.changeStatus("Crashed");
    }
}
