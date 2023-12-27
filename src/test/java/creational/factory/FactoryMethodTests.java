package creational.factory;

import common.enums.DoughType;
import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.model.california.CaliforniaPepperoniPizza;
import creational.factory.model.chicago.ChicagoSausagePizza;
import creational.factory.model.newyork.NewYorkCheesePizza;
import creational.factory.method.SimpleCaliforniaPizzaStore;
import creational.factory.method.SimpleChicagoPizzaStore;
import creational.factory.method.SimpleNewYorkPizzaStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryMethodTests {

    @Test
    void shouldCreateSpecificPizza() {
        SimpleCaliforniaPizzaStore californiaPizzaStore = new SimpleCaliforniaPizzaStore();
        IPizza californiaPizza = californiaPizzaStore.orderPizza(PizzaType.PEPPERONI);

        SimpleNewYorkPizzaStore newYorkPizzaStore = new SimpleNewYorkPizzaStore();
        IPizza newYorkPizza = newYorkPizzaStore.orderPizza(PizzaType.CHEESE);

        SimpleChicagoPizzaStore chicagoPizzaStore = new SimpleChicagoPizzaStore();
        IPizza chicagoPizza = chicagoPizzaStore.orderPizza(PizzaType.SAUSAGE);

        assertTrue(californiaPizza instanceof CaliforniaPepperoniPizza);
        assertEquals(DoughType.NONE, californiaPizza.getDough());

        assertTrue(newYorkPizza instanceof NewYorkCheesePizza);
        assertEquals(DoughType.THIN, newYorkPizza.getDough());

        assertTrue(chicagoPizza instanceof ChicagoSausagePizza);
        assertEquals(DoughType.DEEP_DISH, chicagoPizza.getDough());
    }
}
