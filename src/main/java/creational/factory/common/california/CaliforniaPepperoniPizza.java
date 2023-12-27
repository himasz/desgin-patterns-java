package creational.factory.common.california;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.PepperoniPizza;
import creational.factory.common.CaliforniaIngredientFactory;

public class CaliforniaPepperoniPizza extends PepperoniPizza {

    public CaliforniaPepperoniPizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public CaliforniaPepperoniPizza() {
        this(new CaliforniaIngredientFactory());
        setDough(DoughType.NONE);
    }
}
