package pizza3.series;

import pizza3.Pizza3;

public class VeggiePizza3 extends Pizza3 {
    @Override
    public void prepare() {
        System.out.println("베지테리언 피자 준비");
    }

    @Override
    public void bake() {
        System.out.println("베지테리언 피자 굽기");
    }

    @Override
    public void cut() {
        System.out.println("베지테리언 피자 자르기");
    }

    @Override
    public void box() {
        System.out.println("베지테리언 피자 포장하기");
    }
}
