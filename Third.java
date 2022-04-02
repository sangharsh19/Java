import java.util.Scanner;

public class Third{
  public static void main(String []args)  {
    System.out.println("enter your name and id ");


    Scanner kb = new Scanner(System.in); // reference variable of scanner type created it takes an argument 

    // / Scanner class is used to take input from user 


    String s = kb.nextLine(); // Reference variable calls the function nextLine which reads strings 

    int a = kb.nextInt(); // explanation similar to above

    System.out.println("You name is " +s +"  and your id is " +a );

  }
}
