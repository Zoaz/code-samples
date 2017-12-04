package com.zhangjikai.java8.lambda;

/**
 *
 * @author Jikai Zhang
 * @date 2017/12/4.
 */
public class LambdaTest {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 11;
        run(a, b, (t, t2) -> t.compareTo(t2));
    }

    public static <T> void run(T t, T t2, Larger<T> larger) {
        System.out.println(larger.large(t, t2));
    }

    public void demo() {
        Calculator c = (int a, int b) -> a + b;

        Calculator c2 = new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a + b;
            }
        };
    }


}

@FunctionalInterface
interface Larger<T> {
    int large(T t, T t2);
}