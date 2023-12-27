package common.pizza;

import common.BasicIngredientFactory;
import common.IIngredientFactory;
import common.pizza.interfaces.Pizza;

import java.util.ArrayList;
import java.util.List;

public class SausagePizza extends Pizza {

    public SausagePizza(IIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public SausagePizza() {
        this(new BasicIngredientFactory());
        List<String> toppings = new ArrayList<>();
        toppings.add("Sausage");
        setToppings(toppings);
    }

    @Override
    public void prepare() {
        getIngredientFactory().makeDough();
        getIngredientFactory().makeSauce();
        getIngredientFactory().makeCheese();
        getIngredientFactory().makeSausage();
    }

    @Override
    public void bake() {
        System.out.println("SausagePizza - Bake it");
    }

    @Override
    public void cut() {
        System.out.println("SausagePizza - Slice it");
    }

    @Override
    public void box() {
        System.out.println("SausagePizza - Box it");
    }
}
