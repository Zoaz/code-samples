package com.zhangjikai.java8.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Jikai Zhang
 * @date 2017/12/17.
 */
public class Collect {

    @Test
    public void summarize() {
        Integer[] array = new Integer[]{1, 3, 6, 8, 3, 2};

        // 求和
        long count = Arrays.stream(array).collect(Collectors.counting());
        System.out.println(count);

        // 求最大值
        Optional<Integer> max = Arrays.stream(array).collect(Collectors.maxBy(Comparator.comparing(i -> i)));
        System.out.println(max.get());

        // 求最小值
        Optional<Integer> min = Arrays.stream(array).collect(Collectors.minBy(Comparator.comparing(i -> i)));
        System.out.println(min.get());

        // 求和， Collectors.summingLong 和 Collectors.summingDouble 用于 long 和 double 类型的求和
        int total = Arrays.stream(array).collect(Collectors.summingInt(i -> i));
        System.out.println(total);

        // 求平均数， Collectors.averagingLong 和 Collectors.averagingDouble 用于求 long 和 double 类型的平均值
        // 需要注意的是返回值均为 double
        double average = Arrays.stream(array).collect(Collectors.averagingInt(i -> i));
        System.out.println(average);

        // 字符串连接
        String text = Arrays.stream(array).map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(text);

        /**
         * 获得多个统计信息，包括 sum, average, min, max 和 count
         *
         * Collectors.summarizingLong 和 Collectors.summarizingDouble 用于统计 long 和 double 类型
         */
        IntSummaryStatistics statistics = Arrays.stream(array).collect(Collectors.summarizingInt(i -> i));
        System.out.println(statistics);
    }

    @Test
    public void reducing() {
        Integer[] array = new Integer[]{1, 3, 6, 8, 3, 2};

        int total = Arrays.stream(array).collect(Collectors.reducing(0, Integer::sum));
        System.out.println(total);

        Optional<Integer> optional = Arrays.stream(array).collect(Collectors.reducing(Integer::sum));
        System.out.println(optional.get());
    }

}
