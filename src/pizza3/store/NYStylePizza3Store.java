package pizza3.store;

import pizza3.Pizza3;
import pizza3.series.ny_style.NYStyleCheesePizza3;
import pizza3.series.ny_style.NYStyleClamPizza3;
import pizza3.series.ny_style.NYStylePepperoniPizza3;
import pizza3.series.ny_style.NYStylePizza3;

public class NYStylePizza3Store extends Pizza3Store{
    @Override
    Pizza3 createPizza(String type) {
        Pizza3 pizza;

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
}
