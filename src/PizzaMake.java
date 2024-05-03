import pizza3.store.NYStylePizza3Store;
import pizza3.store.Pizza3Store;

public class PizzaMake {
    public static void main(String[] args) {
        Pizza3Store pizza3Store = new NYStylePizza3Store();
        pizza3Store.orderPizza("pepperoni");
    }
}
