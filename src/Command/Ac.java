package Command;

public class Ac {
    private boolean on = false;

    public void toggle() {
        on = !on;
        System.out.println("AC is now: " + (on ? "ON" : "OFF"));
    }
}
