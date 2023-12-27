package creational.factory.method.base;

import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;

public abstract class SimplePizzaStoreBase {

    public IPizza orderPizza(PizzaType pizzaType) {
        IPizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // This is the factory method
    public abstract IPizza createPizza(PizzaType pizzaType);
}
