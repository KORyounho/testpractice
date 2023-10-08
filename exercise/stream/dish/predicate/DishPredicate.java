package stream.dish.predicate;

public interface DishPredicate<T> {
    public int test(T t1, T t2);
}
