package creational.factory.model.california;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.PepperoniPizza;
import creational.factory.model.CaliforniaIngredientFactory;

public class CaliforniaPepperoniPizza extends PepperoniPizza {

    public CaliforniaPepperoniPizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public CaliforniaPepperoniPizza() {
        this(new CaliforniaIngredientFactory());
        setDough(DoughType.NONE);
    }
}
