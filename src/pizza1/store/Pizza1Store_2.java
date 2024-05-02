package pizza1.store;

import pizza1.Pizza1;
import pizza1.series.CheesePizza1;
import pizza1.series.ClamPizza1;
import pizza1.series.PepperoniPizza1;
import pizza1.series.VeggiePizza1;

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
