package com.bridgelabz.object_oriented;

public class TestThis {
    int rollno;
    String name;
    float fee;

    TestThis(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    public void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }

    public static void main(String[] args) {
        TestThis s1 = new TestThis(111, "ankit", 5000f);
        TestThis s2 = new TestThis(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}


