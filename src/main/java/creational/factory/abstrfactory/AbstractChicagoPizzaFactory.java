package creational.factory.abstrfactory;

import common.IIngredientFactory;
import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.common.ChicagoIngredientFactory;
import creational.factory.common.IPizzaFactory;
import creational.factory.common.chicago.ChicagoCheesePizza;
import creational.factory.common.chicago.ChicagoPepperoniPizza;
import creational.factory.common.chicago.ChicagoSausagePizza;

public class AbstractChicagoPizzaFactory implements IPizzaFactory {

    private final IIngredientFactory ingredientFactory;

    public AbstractChicagoPizzaFactory() {
        this(new ChicagoIngredientFactory());
    }

    public AbstractChicagoPizzaFactory(IIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public IPizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new ChicagoCheesePizza(ingredientFactory);
            case PEPPERONI -> new ChicagoPepperoniPizza(ingredientFactory);
            case SAUSAGE -> new ChicagoSausagePizza(ingredientFactory);
        };
    }
}
