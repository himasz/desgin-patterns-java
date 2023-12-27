package creational.factory.abstrfactory;

import common.IIngredientFactory;
import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.common.CaliforniaIngredientFactory;
import creational.factory.common.IPizzaFactory;
import creational.factory.common.california.CaliforniaCheesePizza;
import creational.factory.common.california.CaliforniaPepperoniPizza;
import creational.factory.common.california.CaliforniaSausagePizza;

public class AbstractCaliforniaPizzaFactory implements IPizzaFactory {

    private final IIngredientFactory ingredientFactory;

    public AbstractCaliforniaPizzaFactory() {
        this(new CaliforniaIngredientFactory());
    }

    public AbstractCaliforniaPizzaFactory(IIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public IPizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new CaliforniaCheesePizza(ingredientFactory);
            case PEPPERONI -> new CaliforniaPepperoniPizza(ingredientFactory);
            case SAUSAGE -> new CaliforniaSausagePizza(ingredientFactory);
        };
    }
}
