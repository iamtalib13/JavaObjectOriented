package com.bridgelabz.object_oriented;

public class SingleInheritance {
    static class Room{
int length;
int breadth;
Room(int x,int y)
{
    length=x;
    breadth=y;
}
int area()
{
    return (length*breadth);
}
    }
    static class Bedroom extends Room{
        int heigth;
        Bedroom(int x,int y, int z)
        {
            super(x,y);
            heigth=z;

        }
        int volume()
        {
            return (length*breadth*heigth);
        }


    }

        public static void main(String[] args) {
            Bedroom room1=new Bedroom(14,12,10);
            int area1= room1.area();
            int volume1=room1.volume();
            System.out.println("Area1 = "+area1);
            System.out.println("Volume = "+volume1);
        }
    }

