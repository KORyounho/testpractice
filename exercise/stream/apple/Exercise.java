package stream.apple;

import static java.awt.Color.GRAY;
import static java.awt.Color.GREEN;
import static java.awt.Color.RED;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import stream.apple.predicate.AppleGreenColorPredicate;
import stream.apple.predicate.AppleHeavyWeightPredicate;
import stream.apple.predicate.ApplePredicate;

public class Exercise {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
//        List<Appgit le> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(GREEN.equals(apple.getColor()))
//                result.add(apple);
//        }
//        return result;
        ApplePredicate<Apple> p = new AppleGreenColorPredicate();
        return filterApples(inventory, p);
        // ApplePredicate를 추가하지 않았을 경우에는 다음과 같이 return 을 구현
        // return filterApples(inventory, Apple :: isGreenApple);
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
//        ---------------------------------------------------------
//        기존 코드

//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(apple.getWeight() > 150)
//                result.add(apple);
//        }
//        return result;
//        ---------------------------------------------------------
//         ApplePredicate를 추가한 경우

//         ApplePredicate<Apple> p = new AppleHeavyWeightPredicate();
//         return filterApples(inventory, p);
//        ---------------------------------------------------------
//         ApplePredicate를 추가하지 않았을 경우에는 다음과 같이 return 을 구현

//         return filterApples(inventory, Apple :: isHeavyApple);
//        ---------------------------------------------------------
//        람다 표현식 ( {}로 안묶어서 body내용으로는 expression이 들어감.
//        그러기에 return이 없음 -> void(리스트는 메모리이기때문에 상관 없음
        return filterApples(inventory, (Apple a) -> a.getColor().equals(GREEN));
//        ---------------------------------------------------------
//        람다 구문표현식 리턴이 필요하기에 넣음.
//        return filterApples(inventory, (Apple a) -> {
//            return a.getColor().equals(GREEN);
//        });
//        ---------------------------------------------------------
    }

    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


    public static List<Apple> filterArrayApplees(List<Apple> inventory) {
        return inventory.stream().filter((Apple a) -> a.getWeight() > 150).collect(Collectors.toList());
    }

    public static List<Apple> filterNotArrayApplees(List<Apple> inventory) {
        return inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150).collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        List<Apple> lis = new ArrayList<>();
//        Apple a1 = new Apple(GREEN);
//        Apple a2 = new Apple(GRAY);
//        Apple a3 = new Apple(RED);
//
//        lis.add(a1);
//        lis.add(a2);
//        lis.add(a3);
//        for (Apple li : lis) {
//            System.out.println(li);
//        }
//        lis = filterGreenApples(lis);
//        System.out.println();
//
//        for (Apple li : lis) {
//            System.out.println(li);
//        }
        List<Apple> lis1 = new ArrayList<>();
        Apple a11 = new Apple(GREEN, 160);
        Apple a12 = new Apple(GRAY, 120);
        Apple a13 = new Apple(RED, 151);
        Apple a14 = new Apple(GREEN, 170);
        Apple a15 = new Apple(GRAY, 167);
        Apple a16 = new Apple(RED, 124);

        lis1.add(a11);
        lis1.add(a12);
        lis1.add(a13);
        lis1.add(a14);
        lis1.add(a15);
        lis1.add(a16);

        System.out.println();
//        lis1 = filterNotArrayApplees(lis1);
        for (Apple apple : lis1) {
            System.out.println(apple);
        }
//        lis1 = filterHeavyApples(lis1);
//        for (Apple apple : lis1) {
//            System.out.println(apple);
//        }
//        lis1 = AppleList.filterApples(lis1, (Apple a) -> a.getWeight() > 150);
//        for (Apple apple : lis1) {
//            System.out.println(apple);
//        }

        System.out.println();
//        Collections.sort(lis1, (Apple a1, Apple a2) -> {return a1.getWeight()- a2.getWeight();});
        for (Apple apple : lis1) {
            System.out.println(apple);
        }
        System.out.println();
        AppleList.sort(lis1, (a1, a2) -> a1.getWeight() - a2.getWeight());
        for (Apple apple : lis1) {
            System.out.println(apple);
        }
    }
}


