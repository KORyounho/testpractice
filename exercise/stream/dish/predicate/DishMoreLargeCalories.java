package stream.dish.predicate;

import stream.dish.Dish;

public class DishMoreLargeCalories implements DishPredicate<Dish> {
    @Override
    public int test(Dish d1, Dish d2) {
        return d1.getCalories() - d2.getCalories();
    }
}
