// Search static vs instance members on GFG
/*
 static variables and fuctions are created by using static keyword
 static members can be accessed without creating an object and they are accesed by class name
 static members are common for all objects of that class 

*/

public class L7 {
 int x ; // instance member variable

 static int y ; //Static member variable // y is variable of entire class
 
 public void fun1(){} // instance member function   // *** Funcions can't have static member variables but we can have static inner class

 public static void fun2(){
   System.out.println("y = "+y);
   //System.out.println("x = "x); // not possible

 } // Static member function // static functions cannot access instace variables i.e. fun2 can't access x
 
 // Syntax for static inner class
 static class Test{
   public static String country = "India";
   public static void name() {
    System.out.println("country = "+country);
   }
  

 }

 
 public static void main(String[]args) { // main
  
  L7.y = 5; // accessing static member variable // static variables are initialized by Zero by default

  L7.fun2(); // accessing static funtion 

  // main can also access y and fun2() without using class name because it is also an static member of L7 class
  // if main were fuction of some other class then it would have bee not possible
  fun2();

  L7.Test.name(); // accessing fuction of static inner class

  // System is a class and out is it's Static member
   
 }
}
