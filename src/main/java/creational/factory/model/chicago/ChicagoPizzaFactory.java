package creational.factory.model.chicago;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.model.IPizzaFactory;

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
