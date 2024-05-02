package pizza3.series.ny_style;

import pizza3.Pizza3;
import pizza3.series.VeggiePizza3;

public class NYStyleVeggiePizza3 extends VeggiePizza3 {
    @Override
    public void prepare() {
        System.out.println("NYStyle 베지테리언 피자 준비");
    }

    @Override
    public void bake() {
        System.out.println("NYStyle 베지테리언 피자 굽기");
    }

    @Override
    public void cut() {
        System.out.println("NYStyle 베지테리언 피자 자르기");
    }

    @Override
    public void box() {
        System.out.println("NYStyle 베지테리언 피자 포장하기");
    }
}
