package creational.factory.simple;

import common.enums.PizzaType;
import common.pizza.CheesePizza;
import common.pizza.PepperoniPizza;
import common.pizza.SausagePizza;
import common.pizza.interfaces.IPizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleFactoryTest {
    @Test
    void shouldCreateSpecificPizza() {
        assertPizzaType(PizzaType.CHEESE, CheesePizza.class);
        assertPizzaType(PizzaType.PEPPERONI, PepperoniPizza.class);
        assertPizzaType(PizzaType.SAUSAGE, SausagePizza.class);
    }

    private void assertPizzaType(PizzaType pizzaType, Class<?> instanceType) {
        IPizza pizza = new SimplePizzaFactory().createPizza(pizzaType);
        assertEquals(instanceType, pizza.getClass());
    }

}