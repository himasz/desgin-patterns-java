package creational.factory.model.california;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.CheesePizza;
import creational.factory.model.CaliforniaIngredientFactory;

public class CaliforniaCheesePizza extends CheesePizza {

    public CaliforniaCheesePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        setDough(DoughType.NONE);
    }

    public CaliforniaCheesePizza() {
        this(new CaliforniaIngredientFactory());
    }
}
