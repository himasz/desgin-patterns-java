package creational.factory.common.chicago;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.SausagePizza;
import creational.factory.common.ChicagoIngredientFactory;

public class ChicagoSausagePizza extends SausagePizza {

    public ChicagoSausagePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public ChicagoSausagePizza() {
        this(new ChicagoIngredientFactory());
        setDough(DoughType.DEEP_DISH);
    }
}
