package pizza3.store;

import pizza3.Pizza3;
import pizza3.series.chicago_style.ChicagoCheesePizza3;
import pizza3.series.chicago_style.ChicagoClamPizza3;
import pizza3.series.chicago_style.ChicagoPepperoniPizza3;
import pizza3.series.chicago_style.ChicagoPizza3;

public class ChicagoStylePizza3Store extends Pizza3Store {
    @Override
    Pizza3 createPizza(String type) {
        Pizza3 pizza;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza3();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza3();
        } else if (type.equals("clam")) {
            pizza = new ChicagoClamPizza3();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoCheesePizza3();
        } else {
            pizza = new ChicagoPizza3();
        }

        return pizza;
    }
}
