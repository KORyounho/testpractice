package stream.dish.dish;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DishExercise {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER));

        List<Dish> filterdMenu = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320) // 정렬을 가정하에 만듬. 사실 break라고 생각하면 될듯
                .collect(toList());
        System.out.println(filterdMenu);

        System.out.println();
        List<Dish> filterMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 300)
                .limit(3)
                .collect(toList());
        System.out.println(filterMenu2);

        List<Dish> skipMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .collect(toList());
        Iterator<Dish> iterator1 = skipMenu.iterator();
        for (Dish menu : skipMenu) {
            System.out.print(menu);
        }


        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );

        System.out.println();
        long count = menu.stream()
                .filter(dish -> dish.getCalories() < 300)
                .distinct()
                .limit(3)
                .count();
        System.out.println(count);

        List<String> names = menu.stream()
                .filter(dish ->{
                    System.out.println("filtering: " +dish.getName());
                    return dish.getCalories()>300;
                })
                .map(dish ->{
                    System.out.println("mapping: " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(toList());

        System.out.println();
        System.out.println(names);

        List<String> threeHighCaloricDishNames = menu.stream().
                filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
        System.out.println(threeHighCaloricDishNames);

        Iterator<Dish> it = menu.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        iterator.Iterator<Dish> iterator = new iterator.Iterator<>();

        for (Dish dish : menu) {
            iterator.insert(dish);
        }

        System.out.println("내가");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
