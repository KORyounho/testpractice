package stream.dish;

import java.util.Comparator;
import stream.dish.predicate.DishMoreLargeCalories;

public class Dish implements Comparator<Dish> {
    private int calories;
    private int number;

    public Dish(int calories, int number){
        this.calories = calories;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "calories=" + calories +
                ", number=" + number +
                '}';
    }

    public int getCalories() {
        return this.calories;
    }
    public static Comparator<Dish> dishComparator(){
        return (d1, d2) -> d1.getCalories() - d2.getCalories();
    }

    @Override
    public int compare(Dish o1, Dish o2) {
        return o1.getCalories() - o2.getCalories();
    }

//    public static int isLargeCalories(Dish d1, Dish d2){
//        return d1.getCalories() - d2.getCalories();
//    }
//    public static int isLargeNumber(Dish d1, Dish d2){
//        return d1.getNumber() - d2.getNumber();
//    } 얘네가 필요가 없나?

    public int getNumber() {
        return this.number;
    }
}
