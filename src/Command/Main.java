package Command;

public class Main {
    public static void main(String[] args) {
        Ac livingRoomAc = new Ac();
        LedLight kitchenLight = new LedLight();

        Command acCommand = new AcToggleCommand(livingRoomAc);
        Command lightCommand = new LightToggleCommand(kitchenLight);

        Remote remote = new Remote();

        remote.setCommand(acCommand);
        remote.pressButton();

        remote.setCommand(lightCommand);
        remote.pressButton();
    }
}
