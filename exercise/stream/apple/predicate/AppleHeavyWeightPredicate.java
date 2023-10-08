package stream.apple.predicate;

import stream.apple.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate<Apple>{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
