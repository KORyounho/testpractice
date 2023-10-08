package typeparameter.user;

import typeparameter.grade.Grade;

public class UserB implements User{
    String name;
    int age;
    Grade grade;

    public UserB(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void setgrade() {
        if (this.age + 10 > 35) {
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
