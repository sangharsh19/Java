// Command line arguments in java 

// some arguments are passed while running a java program
// these are passed in main function and are received by args
// run in cmd to inorder to pass arguments 
// first compile as 
/*

  javac filename.java
  // and run by 
  java filename  //some arguments

*/
public class L9 {
  public static void main(String[] args) {
    
    System.out.print(args[0]);
    
    System.out.print(args[1]);
  }
}
