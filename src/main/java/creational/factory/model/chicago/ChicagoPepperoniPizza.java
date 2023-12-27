package creational.factory.model.chicago;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.PepperoniPizza;
import creational.factory.model.ChicagoIngredientFactory;

public class ChicagoPepperoniPizza extends PepperoniPizza {

    public ChicagoPepperoniPizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        setDough(DoughType.DEEP_DISH);
    }

    public ChicagoPepperoniPizza() {
        this(new ChicagoIngredientFactory());
    }
}
