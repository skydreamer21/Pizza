package pizza2.store;

import pizza2.Pizza2;
import pizza2.factory.SimplePizzaFactory;

public class Pizza2Store {
    SimplePizzaFactory factory;

    public Pizza2Store(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza2 orderPizza(String type) {
        Pizza2 pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
