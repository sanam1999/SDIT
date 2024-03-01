/*
 * File name : Wrapping.java
 * Original Author : 2211-0127
 * File creation date : 2 Feb 2024
 * Development group : Group A
 * Description : A class that demonstrates how to wrap code lines in multiple lines according to best practices and coding standards
 */

 public class Wrapping {
    static double average_mark = 0;
    
    public void calculateAverage(){
        int english;
        int maths;
        int science;

        maths = 83;
        english = 76;
        science = 64;

        average_mark = (maths + english + science) / 3;

        System.out.println("Maths:" + maths + " English:" + english + " Science:" + science 
                            + " Average:" + average_mark);
                            //this is the proper way to wrap codes in multiple lines according to best practices and industry standards

    }
    
    public static void main(String[] args) {

        Wrapping object1 = new Wrapping();
        object1.calculateAverage();
        
    }
    
}
