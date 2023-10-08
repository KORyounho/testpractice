package stream.apple.predicate;

import java.awt.Color;
import stream.apple.Apple;

public class AppleGreenColorPredicate implements ApplePredicate<Apple>{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
