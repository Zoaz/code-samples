package com.zhangjikai.java8.lambda;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Predicate;


/**
 *
 * @author Jikai Zhang
 * @date 2017/12/5.
 */
public class InternalFunctionInterface {


    public <T> boolean judge(T t, Predicate<T> p) {
        return p.test(t);
    }

    @Test
    public void testPredicate() {
        String text = "111";
        Predicate<String> a = s -> s != null;
        Predicate<String> b = s -> s.length() > 3;
        System.out.println(judge(text, a.and(b)));
        System.out.println(judge(text, a.negate()));
        System.out.println(judge(text, a.or(b)));
    }

    public <T> void consume(T t, Consumer<T> c) {
        c.accept(t);
    }

    @Test
    public void testConsume() {
        StringBuilder builder = new StringBuilder();
        Consumer<StringBuilder> a = s -> s.append("abcd");
        Consumer<StringBuilder> b = s -> s.reverse();
        Consumer<StringBuilder> c = s -> s.append("1234");
        consume(builder, a.andThen(b).andThen(c));
        System.out.println(builder.toString());
        //consume(text, s -> System.out.println(s.substring(2)));

    }

}
