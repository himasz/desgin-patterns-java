package creational.factory.common.chicago;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.common.IPizzaFactory;

public class ChicagoPizzaFactory implements IPizzaFactory {

    @Override
    public IPizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new ChicagoCheesePizza();
            case PEPPERONI -> new ChicagoPepperoniPizza();
            case SAUSAGE -> new ChicagoSausagePizza();
        };
    }
}
