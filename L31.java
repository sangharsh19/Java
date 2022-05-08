// String methods in Java
/*
-> case onversion 
  a. toUpperCase();
  b. toLowerCase();
-> indexOf() // returns -1 when doesn't exist
  1. indexOf(char ch)
  2. indexOf(char ch, int fromIndex)
  3. indexOf(String str)
  4. indexOf(String str , int fromIndex)
  5. lastIndexOf(char ch)
  6. lastIndexOf(char ch, int fromIndex)
  7. lastIndexOf(String str)
  8. lastIndexOf(String str , int fromIndex)

-> comparing strings // all funtions are called by String S1
 1. equals(String S2)
 2. equalsIgnoreCase(String anotherString)
 3. compareTo(String S3)  // difference between unicode of first different character

-> substring
 1. substring(int beginindex)
 2. substring(int beginindex, int endindex)  // beginindex is included and endindex is excluded
 
*/
  

public class L31 {

  public static void main(String[] args) {

    String S1 = "Hello";
    System.out.println(S1);
    String S2 =S1.toUpperCase(); // will not change S1 but will return new string(updated) to S2
    System.out.println(S1);
    System.out.println(S2);

    String S3 = S2.toLowerCase();
    System.out.println(S3);

    int i = S1.indexOf('o');
    System.out.println("i = "+i);

    

    
  }
  
}
