package pizza3.series.chicago_style;

import pizza3.Pizza3;
import pizza3.series.CheesePizza3;

public class ChicagoCheesePizza3 extends CheesePizza3 {
    @Override
    public void prepare() {
        System.out.println("Chicago 치즈 피자 준비");
    }

    @Override
    public void bake() {
        System.out.println("Chicago 치즈 피자 굽기");
    }

    @Override
    public void cut() {
        System.out.println("Chicago 치즈 피자 자르기");
    }

    @Override
    public void box() {
        System.out.println("Chicago 치즈 피자 포장하기");
    }
}
