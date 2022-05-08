// String class in java
/*
-> A java.lang.String class is final which implies no class can extend it.
-> String class is immutable , i.e.  strings in java , once created and initialized , cannot be change on the same reference
-> String objects an be used with += and + operators for concatenation
-> 
*/

public class L30 {

  public static void main(String []args ) {

    // syntax for string class

    String str1 = "Hello duniya"; // created without using new
    String str2 = "Hello duniya"; // both str1 and str2 denote the same String object because they are same
    String str3 = "Hello "+"duniya"; // str1 ,str2 , str3 denote the same String object
    // this saves memory 

    String str4 = new String("Hello duniya"); // this will not share memory 

    System.out.println("Result 1: "+(str1 == str2));   // true // comparing references 
    System.out.println("Result 2: "+str1.equals(str2));  // true  // comparing strings
    System.out.println("Result 3: "+(str1 == str4));  // false 
    System.out.println("Result 4: "+str1.equals(str4)); // true

    
  }

  
}
