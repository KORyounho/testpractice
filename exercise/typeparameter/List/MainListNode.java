package typeparameter.List;

public class MainListNode {
    public static void main(String[] args) {
        List<Integer> lis = new ListNode<>();

        lis.add(10);
        lis.add(100);
        lis.add(101);
        lis.add(102);

        lis.remove(10);

        lis.print();

        System.out.println();
        System.out.println(lis.contain(111));
    }
}
