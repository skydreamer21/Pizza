package pizza2.factory;

import pizza2.Pizza2;
import pizza2.series.CheesePizza2;
import pizza2.series.ClamPizza2;
import pizza2.series.PepperoniPizza2;
import pizza2.series.VeggiePizza2;

public class SimplePizzaFactory {

    public Pizza2 createPizza(String type) {
        Pizza2 pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza2();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza2();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza2();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza2();
        } else {
            pizza = new Pizza2();
        }

        return pizza;
    }
}
