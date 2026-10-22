package Command;

public class AcToggleCommand implements Command {
    private Ac device;

    public AcToggleCommand(Ac device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.toggle();
    }
}
