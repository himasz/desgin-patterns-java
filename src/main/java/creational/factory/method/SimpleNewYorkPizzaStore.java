package creational.factory.method;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.model.newyork.NewYorkPizzaFactory;
import creational.factory.method.base.SimplePizzaStoreBase;
import creational.factory.model.IPizzaFactory;

public class SimpleNewYorkPizzaStore extends SimplePizzaStoreBase {

    private final IPizzaFactory factory;

    public SimpleNewYorkPizzaStore() {
        this(new NewYorkPizzaFactory());
    }

    public SimpleNewYorkPizzaStore(IPizzaFactory factory) {
        this.factory = factory;
    }

    @Override
    public IPizza createPizza(PizzaType pizzaType) {
        return factory.createPizza(pizzaType);
    }
}
