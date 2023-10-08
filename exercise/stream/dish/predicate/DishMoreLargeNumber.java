package stream.dish.predicate;

import java.util.Comparator;
import stream.dish.Dish;

public class DishMoreLargeNumber implements DishPredicate<Dish>{
    @Override
    public int test(Dish d1, Dish d2) {
        return d1.getNumber() - d2.getNumber();
    }
}
