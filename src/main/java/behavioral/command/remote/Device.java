package behavioral.command.remote;

// Abstract Receiver (the device that will be controlled)
abstract class Device {
    abstract void turnOn();
    abstract void turnOff();
}
