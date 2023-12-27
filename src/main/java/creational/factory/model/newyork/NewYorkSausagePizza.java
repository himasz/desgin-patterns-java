package creational.factory.model.newyork;

import common.IIngredientFactory;
import common.enums.DoughType;
import common.pizza.SausagePizza;
import creational.factory.model.NewYorkIngredientFactory;

public class NewYorkSausagePizza extends SausagePizza {

    public NewYorkSausagePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        setDough(DoughType.THIN);
    }

    public NewYorkSausagePizza() {
        this(new NewYorkIngredientFactory());
    }
}
