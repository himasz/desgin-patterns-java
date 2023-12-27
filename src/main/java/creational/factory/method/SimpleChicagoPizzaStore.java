package creational.factory.method;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.model.chicago.ChicagoPizzaFactory;
import creational.factory.method.base.SimplePizzaStoreBase;
import creational.factory.model.IPizzaFactory;

public class SimpleChicagoPizzaStore extends SimplePizzaStoreBase {

    private final IPizzaFactory factory;

    public SimpleChicagoPizzaStore() {
        this(new ChicagoPizzaFactory());
    }

    public SimpleChicagoPizzaStore(IPizzaFactory factory) {
        this.factory = factory;
    }

    @Override
    public IPizza createPizza(PizzaType pizzaType) {
        return factory.createPizza(pizzaType);
    }
}
