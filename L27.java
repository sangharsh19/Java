// taking input from user in java
import java.util.Scanner;
import java.util.*; // all classes used

/*

-> we can read java input from System.in using Scanner class
-> Scanner is final class , thats why it cannot be extended
-> Scanner class is part of java.util  package

-> System.in is responsible to take data from keyboard and place it in Buffer (an intermediate lcation)
-> Scanner class uses its funtions which take data from buffer and convert it into integers (or any other data type) until a delimiter is faced
-> delimiters (space , tab , enter ) aka whitespaces
-> the resulting tokens may then be converted  into values if different type using various next methods
 
-> funtions of Scanner class
 1. next()
 2. nextLine()
 3. nextBoolean()
 4. nextInt()
 and so on

*/
public class L27 {

  public static void main(String []args) {

    int x ;
  
    Scanner sc = new Scanner(System.in);  // passing System.in as an arguement in constructor of Scanner // arguemnts can be of different resource
    
    // System.in is used for keyboard 

    x = sc.nextInt();
    System.out.println("x = "+x);
    
  }
  
}
