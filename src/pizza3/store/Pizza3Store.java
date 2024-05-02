package pizza3.store;

import pizza3.Pizza3;

public abstract class Pizza3Store {

    public Pizza3 orderPizza(String type) {
        System.out.println("[Pizza3]");
        Pizza3 pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza3 createPizza(String type);
}
