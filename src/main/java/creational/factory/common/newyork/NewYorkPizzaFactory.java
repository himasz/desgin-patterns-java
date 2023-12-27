package creational.factory.common.newyork;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.common.IPizzaFactory;

public class NewYorkPizzaFactory implements IPizzaFactory {

    @Override
    public IPizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new NewYorkCheesePizza();
            case PEPPERONI -> new NewYorkPepperoniPizza();
            case SAUSAGE -> new NewYorkSausagePizza();
        };
    }
}
