package State;

public class Main {
    static void main(String[] args) {
        CloudServerContext server = new CloudServerContext(new StoppedState());

        server.request();
        server.request();
    }
}
