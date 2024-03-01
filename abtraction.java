
/*
 * File name : Account.java
 * Original Author : 2211-0127
 * File creation date : 1 march 2023
 * Development group : Group A
 * Description : A class that takes customer information and prints out delivery status
 */

import java.util.Scanner;

abstract class GraphicOjects{
    abstract void showShape();
    abstract void Area();
    
}

class Circule extends GraphicOjects{
    Scanner sc = new Scanner(System.in);
    @Override
    void showShape() {
       System.out.println("object type of Circule");
    }
    void Area() {
        System.out.println("enter value for Circule");
        int a = sc.nextInt();
        System.out.println(3.14159*(a*a));
     }

}

class Rectangle extends GraphicOjects{
    Scanner sc = new Scanner(System.in);
    @Override
    void showShape() {
        System.out.println("object type of Rectangle");
    }
    void Area() {
        System.out.println("enter value for hight");
        int h = sc.nextInt();
        System.out.println("enter value for wight");
        int w = sc.nextInt();
        System.out.println(h*w);
     }

}

class triangle extends GraphicOjects{
    Scanner sc = new Scanner(System.in);
    @Override
    void showShape() {
        System.out.println("object type of triangle");
    }
    void Area() {
        System.out.println("enter value for base ");
        int h = sc.nextInt();
        System.out.println("enter value for hight");
        int w = sc.nextInt();
        System.out.println(0.1*h*w);
     }

}

public class abtraction {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        GraphicOjects obj = new Circule();
        obj.showShape();
        obj.Area();
        obj = new Rectangle();
        obj.showShape();
        obj.Area();
        obj = new triangle();
        obj.showShape();
        obj.Area();
    }
    
}
