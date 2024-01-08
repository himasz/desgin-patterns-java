package behavioral.command.remote;

// Concrete Command for turning a device on
class TurnOnCommand implements Command {
    private final Device device;

    TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
