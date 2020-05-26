package command;

public class LampOnCommand implements Command {
    private Lamp lamp;

    LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void run() {
        lamp.turnOn();
    }
}
