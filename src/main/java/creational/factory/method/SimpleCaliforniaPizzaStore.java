package creational.factory.method;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.common.california.CaliforniaPizzaFactory;
import creational.factory.method.base.SimplePizzaStoreBase;
import creational.factory.common.IPizzaFactory;

public class SimpleCaliforniaPizzaStore extends SimplePizzaStoreBase {

    private final IPizzaFactory factory;

    public SimpleCaliforniaPizzaStore() {
        this(new CaliforniaPizzaFactory());
    }

    public SimpleCaliforniaPizzaStore(IPizzaFactory factory) {
        this.factory = factory;
    }

    @Override
    public IPizza createPizza(PizzaType pizzaType) {
        return factory.createPizza(pizzaType);
    }
}
