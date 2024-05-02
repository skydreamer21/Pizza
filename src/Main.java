import pizza2.factory.SimplePizzaFactory;
import pizza2.store.Pizza2Store;
import pizza3.store.NYStylePizza3Store;
import pizza3.store.Pizza3Store;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza2Store store = new Pizza2Store(factory);
        store.orderPizza("pepperoni");

        System.out.println();

        Pizza3Store pizza3Store = new NYStylePizza3Store();
        pizza3Store.orderPizza("pepperoni");
    }
}