package store.pizza1store;

import pizza.Pizza1;
import pizza.pizza1_series.CheesePizza1;
import pizza.pizza1_series.GreekPizza1;
import pizza.pizza1_series.PepperoniPizza1;

public class Pizza1Store {

    public Pizza1 orderPizza(String type) {
        Pizza1 pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza1();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza1();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza1();
        } else {
            pizza = new Pizza1();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
