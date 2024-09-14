package practice;

import java.util.Scanner;  // Import the Scanner class
public class Practice {
    public static void main(String[] args) {
 
    Scanner myObj = new Scanner(System.in);
    
    String userName;
    System.out.println("Good day!\nEnter username"); 
    userName = myObj.nextLine();    
    System.out.println("Username is: " + userName); 
    
    
    System.out.println("Enter age"); 
    int age = myObj.nextInt();   
    System.out.println("Age: " + age);    
    
    System.out.println("Enter year today: ");
    int birthyear = myObj.nextInt();  
    System.out.println("Your birthyear: " + birthyear);
    
    int time = birthyear - age;
    System.out.println("Your age is: " + time);
    
    String course;
    System.out.println("Enter course");
    course = myObj.next();
    System.out.println("Course: " + course);
  }
}
