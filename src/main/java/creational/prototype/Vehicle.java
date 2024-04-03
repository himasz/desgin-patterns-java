package creational.prototype;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Vehicle implements Cloneable {
    protected String brand;
    protected String model;
    protected String color;

    // Constructor
    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    // Implement clone method
    @Override
    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e); // Should never happen
        }
    }
}
