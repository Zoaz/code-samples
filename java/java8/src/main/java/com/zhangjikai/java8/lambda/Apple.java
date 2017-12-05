package com.zhangjikai.java8.lambda;

/**
 *
 * @author Jikai Zhang
 * @date 2017/12/5.
 */
public class Apple {

    private String color;
    private int weight;
    
    public Apple() {
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
            "color='" + color + '\'' +
            ", weight=" + weight +
            '}';
    }
}
