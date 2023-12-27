package creational.factory.simple;

import common.enums.PizzaType;
import common.pizza.CheesePizza;
import common.pizza.interfaces.IPizza;
import common.pizza.PepperoniPizza;
import common.pizza.SausagePizza;
import creational.factory.model.IPizzaFactory;

public class SimplePizzaFactory implements IPizzaFactory {
    @Override
    public IPizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new CheesePizza();
            case PEPPERONI -> new PepperoniPizza();
            case SAUSAGE -> new SausagePizza();
        };
    }
}
