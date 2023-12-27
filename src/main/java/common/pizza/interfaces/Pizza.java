package common.pizza.interfaces;

import common.enums.DoughType;
import common.IIngredientFactory;

import java.util.List;

public abstract class Pizza implements IPizza {
    protected IIngredientFactory ingredientFactory;

    protected Pizza(IIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    protected List<String> toppings;
    protected List<String> seasonings;
    protected DoughType dough;
    protected String sauceType;

    @Override
    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public DoughType getDough() {
        return dough;
    }

    @Override
    public List<String> getSeasonings() {
        return seasonings;
    }

    @Override
    public String getSauceType() {
        return sauceType;
    }

    public void setDough(DoughType dough) {
        this.dough = dough;
    }

    public IIngredientFactory getIngredientFactory() {
        return ingredientFactory;
    }
}
