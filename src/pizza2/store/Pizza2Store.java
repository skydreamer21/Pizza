package pizza2.store;

import pizza2.Pizza2;
import pizza2.Pizza2_2;
import pizza2.factory.SimplePizzaFactory;

public class Pizza2Store {
    SimplePizzaFactory factory;

    public Pizza2Store(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza2 orderPizza(String type) {
        Pizza2 pizza;

        pizza = factory.createPizza(type);

//        prepare(pizza);
//        bake(pizza, 5);
//        cut(pizza);
//        box(pizza);

        return pizza;
    }

//    public void prepare(Pizza2 pizza) {
//        pizza.prepare();
//    }
//
//    public void bake(Pizza2 pizza) {
//        pizza.bake(5);
//    }
//
//    public void bake(Pizza2 pizza, int time) {
//        pizza.bake(time);
//    }
//
//    public void cut(Pizza2 pizza) {
//        pizza.cut(4);
//    }
//
//    public void box(Pizza2 pizza) {
//        pizza.box("Pizza2_2Store");
//    }
}

// CheesePizza
