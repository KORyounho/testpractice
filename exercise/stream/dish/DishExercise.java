package stream.dish;

import java.util.ArrayList;
import java.util.List;

public class DishExercise {
    public static void main(String[] args) {
        List<Dish> list = new ArrayList<>();

        Dish d1 = new Dish(401, 1);
        Dish d2 = new Dish(301, 16);
        Dish d3 = new Dish(422, 14);
        Dish d4 = new Dish(662, 18);
        Dish d5 = new Dish(1002, 21);
        Dish d6 = new Dish(124, 33);
        Dish d7 = new Dish(304, 2);
        Dish d8 = new Dish(423, 7);
        Dish d9 = new Dish(477, 11);

        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);
        list.add(d7);
        list.add(d8);
        list.add(d9);

        for (Dish dish : list) {
            System.out.println(dish);
        }

        System.out.println();
        DishList.sort(list);
        for (Dish dish : list) {
            System.out.println(dish);
        }

        DishList.sort(list, (com1, com2) -> com1.getNumber() - com2.getNumber());
        System.out.println();
        for (Dish dish : list) {
            System.out.println(dish);
        }

        DishList.sortByCalories(list);
        System.out.println();
        for (Dish dish : list) {
            System.out.println(dish);
        }

        DishList.sortByNumber(list);
        System.out.println();
        for (Dish dish : list) {
            System.out.println(dish);
        }
    }
}
