package pizza4.store;

import pizza4.Pizza4;

public abstract class Pizza4Store {

    public Pizza4 orderPizza(String type) {
        System.out.println("[Pizza4]");
        Pizza4 pizza;

        pizza = createPizza(type);

        prepare(pizza);
        bake(pizza);
        cut(pizza);
        box(pizza);

        return pizza;
    }

    abstract Pizza4 createPizza(String type);

    public void prepare(Pizza4 pizza) {
        pizza.prepare();
    }

    public void bake(Pizza4 pizza) {
        pizza.bake(5);
    }

    public void cut(Pizza4 pizza) {
        pizza.cut(4);
    }

    public void box(Pizza4 pizza) {
        pizza.box("Pizza4Store");
    }
}
