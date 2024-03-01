/*
 * File name : Account.java
 * Original Author : 2211-0127
 * File creation date : 12 Jan 2023
 * Development group : Group A
 * Description : A class that takes customer information and prints out delivery status
 */

 import java.util.*;
 public class Account{
 
 public String email;
 public String password;
 public String userType;
 
 public void placePackage(String email){ 
 
     System.out.println("Enter package destination :");
     Scanner sc = new Scanner(System.in);
     String destination = sc.nextLine();
 
 System.out.println("Package delivered successfully to "+destination);
     sc.close();
 }
 
 public static void main(String[] args) {
     
     Account user1 = new Account();
     user1.placePackage("email@test.com");
     //System.out.print("Hello");
     
 }
 
 }
 
 