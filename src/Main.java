import pizza2.Pizza2_2;
import pizza2.factory.SimplePizzaFactory;
import pizza2.store.Pizza2Store;
import pizza3.store.NYStylePizza3Store;
import pizza3.store.Pizza3Store;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza2Store store = new Pizza2Store(factory);
        // Pizza2Store => 5분 bake, 4조각으로 자르고 Pizza2_2Store 포장함.

//        Pizza2_2 pizza1 = store.orderPizza("pepperoni");

//        Pizza2_2 pizza2 = store.orderPizza2("pepperoni");

        // orderPizza 메서드를 쓰는 사람은 어떤 메서드를 써서 만들어야하느느지??
        // 하나만 나와야 된다 직관적으로 설명
        // 메소드 늘려서 이유 설명..

        System.out.println();

        Pizza3Store pizza3Store = new NYStylePizza3Store();
        pizza3Store.orderPizza("pepperoni");
    }
}