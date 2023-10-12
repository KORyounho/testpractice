import org.example.Apple;
import org.example.ListNode;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTest {

    @Test
    @DisplayName("first add test")
    void testListNodeFirstInsert(){
        ListNode<Apple> lis = new ListNode<>();
        Apple a1 = new Apple("green apple", 20);
        lis.add(a1);
        System.out.println(lis.get(0));
        System.out.println(a1);
        Assertions.assertTrue(a1.equals(lis.get(0)));
    }
    @Test
    @DisplayName("common add test")
    void testListNodeInsert(){
        ListNode<Apple> lis = new ListNode<>();
        Apple a1 = new Apple("green apple", 20);
        Apple a2 = new Apple("red apple", 25);

        lis.add(a1);
        lis.add(a2);

        Assertions.assertTrue(a2.equals(lis.get(1)));

    }

}
