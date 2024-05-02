package store.pizza1store;

import pizza.Pizza1;
import pizza.pizza1_series.*;

public class Pizza1Store_2 {
    public Pizza1 orderPizza(String type) {
        Pizza1 pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza1();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza1();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza1();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza1();
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
