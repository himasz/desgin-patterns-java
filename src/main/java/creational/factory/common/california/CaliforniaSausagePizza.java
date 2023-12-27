package creational.factory.common.california;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.SausagePizza;
import creational.factory.common.CaliforniaIngredientFactory;

public class CaliforniaSausagePizza extends SausagePizza {

    public CaliforniaSausagePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public CaliforniaSausagePizza() {
        this(new CaliforniaIngredientFactory());
        setDough(DoughType.NONE);
    }
}
