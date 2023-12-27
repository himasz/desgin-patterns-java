package creational.factory.common.chicago;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.CheesePizza;
import creational.factory.common.ChicagoIngredientFactory;

public class ChicagoCheesePizza extends CheesePizza {

    public ChicagoCheesePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public ChicagoCheesePizza() {
        this(new ChicagoIngredientFactory());
        setDough(DoughType.DEEP_DISH);
    }
}
