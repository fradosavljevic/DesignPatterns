package Command;

public class LightToggleCommand implements Command {
    private LedLight light;

    public LightToggleCommand(LedLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
