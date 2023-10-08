package stream.apple;

import java.awt.Color;
import java.util.Comparator;
import java.util.function.Predicate;

public class Apple implements Predicate<Apple> , Comparable<Apple> {
    Color color;
    int weight;

    public Apple(Color color){
        this.color = color;
    }

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" +
                "color = " + color +
                ", weight = " + weight + '}';
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }
    public static boolean isGreenApple(Apple apple){
        return apple.getColor().equals(Color.GREEN);
    }

    @Override
    public boolean test(Apple apple) {
        return false;
    }

    @Override
    public int compareTo(Apple apple) {
        return this.getWeight() - apple.getWeight();
    }
}
