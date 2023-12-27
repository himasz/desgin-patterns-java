package common.pizza;

import common.BasicIngredientFactory;
import common.IIngredientFactory;
import common.pizza.interfaces.Pizza;

import java.util.ArrayList;
import java.util.List;

public class CheesePizza extends Pizza {

    public CheesePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public CheesePizza() {
        this(new BasicIngredientFactory());
        List<String> toppings = new ArrayList<>();
        toppings.add("Cheese");
        setToppings(toppings);
    }

    @Override
    public void prepare() {
        getIngredientFactory().makeDough();
        getIngredientFactory().makeSauce();
        getIngredientFactory().makeCheese();
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza - Bake it");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza - Slice it");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza - Box it");
    }
}
