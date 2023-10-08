package stream.dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import stream.dish.predicate.DishMoreLargeCalories;
import stream.dish.predicate.DishMoreLargeNumber;
import stream.dish.predicate.DishPredicate;


public class DishList{

    private static final int LOWCALORIES = 400;
    List<Dish> menu;

    public static void lowCaloricDishes(List<Dish> menu){
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if(dish.getCalories() < LOWCALORIES){
                lowCaloricDishes.add(dish);
            }
        }
    }
    public static List<Dish> copy(List<Dish> menu){

        List<Dish> newList = new ArrayList<>();
        for (Dish dish : menu) {
            newList.add(new Dish(dish.getCalories(), dish.getNumber()));
        }
        return newList;
    }

    public static void sort(List<Dish> menu){
        Collections.sort(menu, (d1, d2) -> Integer.compare(d1.getCalories(), d2.getCalories()));
//        Collections.sort(this.menu, Comparator.comparing(Dish::getCalories));
    }
    public static void sort(List<Dish> menu, Comparator<Dish> comparator){
        menu.sort(comparator);
//        Collections.sort(this.menu, Comparator.comparing(Dish::getCalories));
    }

    public static List<Dish> sortNewList(List<Dish> menu, Comparator<Dish> compare){
        List<Dish> newList = copy(menu);
        newList.sort(compare);
        return newList;
    }
    public static List<Dish> sortNewList(List<Dish> menu){
        List<Dish> newList = copy(menu);
        newList.sort(Dish.dishComparator());
        return newList;
//        DishList.sort(menu);
    }
    private static void sortBySomething(List<Dish> menu, DishPredicate<Dish> dishDishPredicate){
        Collections.sort(menu, dishDishPredicate::test);
    }
    public static void sortByNumber(List<Dish> menu){
        DishPredicate<Dish> dishDishPredicate = new DishMoreLargeNumber();
        sortBySomething(menu, dishDishPredicate);
    }
    public static void sortByCalories(List<Dish> menu){
        DishPredicate<Dish> dishDishPredicate = new DishMoreLargeCalories();
        sortBySomething(menu, dishDishPredicate);
    }

}
