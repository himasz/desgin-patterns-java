package creational.factory.model.chicago;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.SausagePizza;
import creational.factory.model.ChicagoIngredientFactory;

public class ChicagoSausagePizza extends SausagePizza {

    public ChicagoSausagePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public ChicagoSausagePizza() {
        this(new ChicagoIngredientFactory());
        setDough(DoughType.DEEP_DISH);
    }
}
