package pizza3.series.chicago_style;

import pizza3.Pizza3;
import pizza3.series.ClamPizza3;

public class ChicagoClamPizza3 extends ClamPizza3 {
    @Override
    public void prepare() {
        System.out.println("Chicago 클램 피자 준비");
    }

    @Override
    public void bake() {
        System.out.println("Chicago 클램 피자 굽기");
    }

    @Override
    public void cut() {
        System.out.println("Chicago 클램 피자 자르기");
    }

    @Override
    public void box() {
        System.out.println("Chicago 클램 피자 포장하기");
    }
}
