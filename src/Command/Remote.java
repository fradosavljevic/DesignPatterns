package Command;

public class Remote {
    private Command cmd;

    public void setCommand(Command cmd) {
        this.cmd = cmd;
    }

    public void pressButton() {
        if(cmd != null) {
            cmd.execute();
        }
    }
}
