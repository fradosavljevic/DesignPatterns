package Command;

public class LedLight {
    private boolean on = false;

    public void toggle() {
        on = !on;
        System.out.println("LedLight is now: " + (on ? "ON" : "OFF"));
    }
}
