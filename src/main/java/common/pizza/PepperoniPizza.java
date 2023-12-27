package common.pizza;

import common.BasicIngredientFactory;
import common.IIngredientFactory;
import common.pizza.interfaces.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public PepperoniPizza() {
        this(new BasicIngredientFactory());
        List<String> toppings = new ArrayList<>();
        toppings.add("Pepperoni");
        setToppings(toppings);
    }

    @Override
    public void prepare() {
        getIngredientFactory().makeDough();
        getIngredientFactory().makeSauce();
        getIngredientFactory().makeCheese();
        getIngredientFactory().makePepperoni();
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza - Bake it");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza - Slice it");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza - Box it");
    }
}
