package behavioral.command.remote;

// Client code
public class CommandPatternExample {
    public static void main(String[] args) {
        // Create a light (concrete receiver)
        Device light = new Light();

        // Create command objects for turning the light on and off
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        // Create a remote control (invoker) and set the commands
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);

        // Press the button to turn the light on
        remoteControl.pressButton();

        // Change the command to turn the light off
        remoteControl.setCommand(turnOffCommand);

        // Press the button to turn the light off
        remoteControl.pressButton();
    }
}