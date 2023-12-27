package creational.factory.abstrfactory;

import common.IIngredientFactory;
import common.enums.PizzaType;
import common.pizza.interfaces.IPizza;
import creational.factory.common.IPizzaFactory;
import creational.factory.common.NewYorkIngredientFactory;
import creational.factory.common.newyork.NewYorkCheesePizza;
import creational.factory.common.newyork.NewYorkPepperoniPizza;
import creational.factory.common.newyork.NewYorkSausagePizza;

public class AbstractNewYorkPizzaFactory implements IPizzaFactory {

    private final IIngredientFactory ingredientFactory;

    public AbstractNewYorkPizzaFactory() {
        this(new NewYorkIngredientFactory());
    }

    public AbstractNewYorkPizzaFactory(IIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public IPizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new NewYorkCheesePizza(ingredientFactory);
            case PEPPERONI -> new NewYorkPepperoniPizza(ingredientFactory);
            case SAUSAGE -> new NewYorkSausagePizza(ingredientFactory);
        };
    }
}
