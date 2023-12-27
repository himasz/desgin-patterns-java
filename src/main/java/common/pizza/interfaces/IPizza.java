package common.pizza.interfaces;

import common.enums.DoughType;

import java.util.List;

public interface IPizza {
    List<String> getToppings();
    DoughType getDough();
    List<String> getSeasonings();
    String getSauceType();
    void prepare();

    void bake();

    void cut();

    void box();

}