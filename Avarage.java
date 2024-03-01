/*Original author : 2211-0127
 File name : Student.java
 Date created : 12 Jan 2023
 Description : A simple java class to find out whther a student is an adult according to their age
*/

public class Avarage 
{
    
    public double maths = 86;
    public double english = 67;
    public double science = 73;
    public double average = 0;

    public void calculateAverage () 
    {
        average = (maths + english + science) / 3;
        //divide the total marks by the number of subjects to get average
        
    }
    
    public void displayAverageMarks()
    {
        System.out.println("Your average marks is : "+ String.format("%.2f", average));
    }


    public static void main(String[] args) 
    {
        Avarage average1 = new Avarage();

        average1.calculateAverage();
        average1.displayAverageMarks();
    }
}
