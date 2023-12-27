package creational.factory.model;

import common.pizza.interfaces.IPizza;
import common.enums.PizzaType;

public interface IPizzaFactory {
    IPizza createPizza(PizzaType type);
}