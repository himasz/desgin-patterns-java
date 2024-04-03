package creational.prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class Bus extends Vehicle {
    private int seatingCapacity; // Specific to Bus

    public Bus(String brand, String model, String color, int seatingCapacity) {
        super(brand, model, color);
        this.seatingCapacity = seatingCapacity;
    }

    // Bus-specific methods can be added here
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
