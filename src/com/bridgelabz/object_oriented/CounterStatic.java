package com.bridgelabz.object_oriented;

public class CounterStatic {

    static int counter=0;

    public void getCounter()
    {
        counter=counter+1;
        System.out.println("counter : "+counter);

    }

    public static void main(String[] args) {
        CounterStatic obj1=new CounterStatic();
        CounterStatic obj2=new CounterStatic();
        CounterStatic obj3=new CounterStatic();
        obj1.getCounter();
        obj2.getCounter();
        obj3.getCounter();
    }
}
