package typeparameter.user;

import typeparameter.grade.Grade;

public class UserA implements User {
    String name;
    int age;

    Grade grade;

    public UserA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void setgrade() {
        if (age + 5 > 35) {
            this.grade = Grade.VIP;
        } else {
            this.grade = Grade.BASIC;
        }
    }

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age + ", grade = " + grade;
    }
}
