package creational.factory;

import common.enums.DoughType;
import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.abstrfactory.AbstractCaliforniaPizzaFactory;
import creational.factory.abstrfactory.AbstractChicagoPizzaFactory;
import creational.factory.abstrfactory.AbstractNewYorkPizzaFactory;
import creational.factory.model.california.CaliforniaCheesePizza;
import creational.factory.model.chicago.ChicagoPepperoniPizza;
import creational.factory.model.newyork.NewYorkSausagePizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractFactoryTest {
    @Test
    void shouldCreateSpecificPizza() {
        AbstractChicagoPizzaFactory chicagoPizzaFactory = new AbstractChicagoPizzaFactory();
        AbstractNewYorkPizzaFactory newYorkPizzaFactory = new AbstractNewYorkPizzaFactory();
        AbstractCaliforniaPizzaFactory californiaPizzaFactory = new AbstractCaliforniaPizzaFactory();

        IPizza cheeseCaliforniaPizza = californiaPizzaFactory.createPizza(PizzaType.CHEESE);
        IPizza sausageNewYorkPizza = newYorkPizzaFactory.createPizza(PizzaType.SAUSAGE);
        IPizza pepperoniChicagoPizza = chicagoPizzaFactory.createPizza(PizzaType.PEPPERONI);

        assertTrue(cheeseCaliforniaPizza instanceof CaliforniaCheesePizza);
        assertEquals(DoughType.NONE, cheeseCaliforniaPizza.getDough());

        assertTrue(sausageNewYorkPizza instanceof NewYorkSausagePizza);
        assertEquals(DoughType.THIN, sausageNewYorkPizza.getDough());

        assertTrue(pepperoniChicagoPizza instanceof ChicagoPepperoniPizza);
        assertEquals(DoughType.DEEP_DISH, pepperoniChicagoPizza.getDough());

    }
}
