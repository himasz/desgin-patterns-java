package creational.factory.model.california;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.model.IPizzaFactory;

public class CaliforniaPizzaFactory implements IPizzaFactory {

    @Override
    public IPizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new CaliforniaCheesePizza();
            case PEPPERONI -> new CaliforniaPepperoniPizza();
            case SAUSAGE -> new CaliforniaSausagePizza();
        };
    }
}
