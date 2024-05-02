package pizza4.store;

import pizza3.Pizza3;
import pizza3.series.ny_style.NYStyleCheesePizza3;
import pizza3.series.ny_style.NYStyleClamPizza3;
import pizza3.series.ny_style.NYStylePepperoniPizza3;
import pizza3.series.ny_style.NYStylePizza3;
import pizza3.store.Pizza3Store;
import pizza4.Pizza4;

public class NYStylePizza4Store extends Pizza4Store {
    @Override
    Pizza4 createPizza(String type) {
        Pizza4 pizza;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza3();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza3();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza3();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleCheesePizza3();
        } else {
            pizza = new NYStylePizza3();
        }

        return pizza;
    }

    public void addtional() {

    }
}
