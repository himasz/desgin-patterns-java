package creational.factory.common.newyork;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.CheesePizza;
import creational.factory.common.NewYorkIngredientFactory;

public class NewYorkCheesePizza extends CheesePizza {

    public NewYorkCheesePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public NewYorkCheesePizza() {
        this(new NewYorkIngredientFactory());
        setDough(DoughType.THIN);
    }
}
