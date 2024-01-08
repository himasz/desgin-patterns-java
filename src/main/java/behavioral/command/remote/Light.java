package behavioral.command.remote;

// Concrete Receiver (Light)
class Light extends Device {
    @Override
    void turnOn() {
        System.out.println("Light is ON");
    }

    @Override
    void turnOff() {
        System.out.println("Light is OFF");
    }
}