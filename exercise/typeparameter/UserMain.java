package typeparameter;

import typeparameter.List.List;
import typeparameter.List.ListNode;
import typeparameter.user.User;
import typeparameter.user.UserA;
import typeparameter.user.UserB;

public class UserMain {
    public static void main(String[] args) {
        List<User> lis = new ListNode<User>();

        User a = new UserA("김윤호", 25);

        User b = new UserB("변정훈", 30);

        a.setgrade();
        b.setgrade();

        lis.add(a);
        lis.add(b);

        lis.print();
    }
}
