import java.util.Scanner;

/*****************************************************************
 * Filename: Main.java
 * Original Author: sanma shrestha
 * File create date: 2024-01-12
 * Development group: horizon
 * Description: Printing id, name, and age
 ****************************************************************/

public class Main {
    public static class Account {
        int id;

    }   
  public static void disition(Main.Account a1){
    if(a1.id<10){
        System.out.println("your age is greter then 18");
    }
    else{
        System.out.println("your age is less  then 18");
    }
  }
    public static void main(String[] args) {
        Account a1 = new Account(); // Creating an object
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your age");
        a1.id = Sc.nextInt();
        disition(a1);
    }
}
