package behavioral.command.remote;

// Concrete Command for turning a device off
class TurnOffCommand implements Command {
    private final Device device;

    TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}