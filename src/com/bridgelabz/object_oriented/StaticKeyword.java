package com.bridgelabz.object_oriented;

public class StaticKeyword {
    static void myStaticMethod() {
        System.out.println("Static Method can be called without creating objects");

    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating object");
    }

    public static void main(String[] args) {
        myStaticMethod();

        StaticKeyword myObj = new StaticKeyword();
        myObj.myPublicMethod();
    }

}
