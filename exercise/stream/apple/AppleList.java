package stream.apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import stream.apple.predicate.ApplePredicate;

public class AppleList<Apple> extends ArrayList<stream.apple.Apple> {
    public static List<stream.apple.Apple> filterGreenApples(List<stream.apple.Apple> inventory){
//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(GREEN.equals(apple.getColor()))
//                result.add(apple);
//        }
//        return result;
        return filterApples(inventory, stream.apple.Apple::isGreenApple);
    }
    public static List<stream.apple.Apple> filterHeavyApples(List<stream.apple.Apple> inventory){
//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(apple.getWeight() > 150)
//                result.add(apple);
//        }
//        return result;
        return filterApples(inventory, stream.apple.Apple::isHeavyApple);
    }

    public static List<stream.apple.Apple> filterApples(List<stream.apple.Apple> inventory,
                                           ApplePredicate<stream.apple.Apple> p){
        List<stream.apple.Apple> result = new ArrayList<>();

        for(stream.apple.Apple apple : inventory){
            if(p.test(apple))
                result.add(apple);
        }
        return result;
    }

    public static void sort(List<stream.apple.Apple> lis, Comparator<stream.apple.Apple> com){
        Collections.sort(lis, com);
    }

//    public static List<Apple> filterApplees(List<Apple> inventory, Predicate<Apple> p){
//
//    }
}
