package creational.factory.common.newyork;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.PepperoniPizza;
import creational.factory.common.NewYorkIngredientFactory;

public class NewYorkPepperoniPizza extends PepperoniPizza {

    public NewYorkPepperoniPizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public NewYorkPepperoniPizza() {
        this(new NewYorkIngredientFactory());
        setDough(DoughType.THIN);
    }
}
