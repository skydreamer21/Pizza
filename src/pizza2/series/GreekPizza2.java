package pizza2.series;

import pizza2.Pizza2;

public class GreekPizza2 extends Pizza2 {
    @Override
    public void prepare() {
        System.out.println("그릭 피자 준비");
    }

    @Override
    public void bake() {
        System.out.println("그릭 피자 굽기");
    }

    @Override
    public void cut() {
        System.out.println("그릭 피자 자르기");
    }

    @Override
    public void box() {
        System.out.println("그릭 피자 포장하기");
    }
}
