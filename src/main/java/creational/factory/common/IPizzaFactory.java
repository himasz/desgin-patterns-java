package creational.factory.common;

import common.pizza.interfaces.IPizza;
import common.enums.PizzaType;

public interface IPizzaFactory {
    IPizza createPizza(PizzaType type);
}