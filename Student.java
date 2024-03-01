/*
 *Original author : 2211-0127
 File name : Student.java
 Date created : 12 Jan 2023
 Description : A simple java class to find out whther a student is an adult according to their age
 */
import java.util.*;

public class Student 
{
    public String studentName; 
    public int age;

    public void displayStudentInformation()
    {
        System.out.println(studentName + " you are " + age + " years old.\n");
    }

    public void checkAge()
    {

        System.out.println("Enter your age :");
        Scanner scanner1 = new Scanner(System.in);
        age = scanner1.nextInt();
        

        System.out.println("Enter your name :");
        Scanner scanner2 = new Scanner(System.in);
        studentName = scanner2.nextLine();
        

        if (age >= 18) //check whether the student is an adult or not.
        {
            System.out.println("You are an adult");
            displayStudentInformation(); //prints out the students name along their age
        }
        else
        {
            System.out.println("Your are not an adult");
            displayStudentInformation(); //prints out the students name along their age
        }

        scanner1.close();
        scanner2.close();
    }
    
    public static void main(String[] args) 
    {
        while (true)
        {
            Student std1 = new Student();
            std1.checkAge();


        }
        
    }
}
