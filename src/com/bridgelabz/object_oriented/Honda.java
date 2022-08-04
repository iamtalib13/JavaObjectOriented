package com.bridgelabz.object_oriented;

abstract class Bike {
    abstract void run();
}

public class Honda extends Bike {
    @Override
    void run() {
        System.out.println("running safely");
    }

    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
    }
}
