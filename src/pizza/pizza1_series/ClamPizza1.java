package pizza.pizza1_series;

import pizza.Pizza1;

public class ClamPizza1 extends Pizza1 {
    @Override
    public void prepare() {
        System.out.println("클램 피자 준비");
    }

    @Override
    public void bake() {
        System.out.println("클램 피자 굽기");
    }

    @Override
    public void cut() {
        System.out.println("클램 피자 자르기");
    }

    @Override
    public void box() {
        System.out.println("클램 피자 포장하기");
    }
}
