package creational.prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class Car extends Vehicle {
    private int maxSpeed; // Specific to Car

    public Car(String brand, String model, String color, int maxSpeed) {
        super(brand, model, color);
        this.maxSpeed = maxSpeed;
    }

    // Car-specific methods can be added here
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
