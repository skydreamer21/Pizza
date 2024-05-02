package pizza3.series.chicago_style;

import pizza3.Pizza3;

public class ChicagoPizza3 extends Pizza3 {
    public void prepare() {
        System.out.println("Chicago 피자 재료 준비");
    }

    public void bake() {
        System.out.println("Chicago 피자 굽기");
    }

    public void cut() {
        System.out.println("Chicago 피자 자르기");
    }

    public void box() {
        System.out.println("Chicago 피자 포장하기");
    }
}
