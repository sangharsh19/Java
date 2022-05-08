// final keyword in Java
/*
  Can be used in
  1. final instance variable
  2. final static variable
  3. final local variable
  4. final class
  5. final methods 
*/

/*
1. final instance variable
-> The final variable can be assigned only once and it can't be altered later (analogous to const in C++)
-> They can be initialized while creating variable or by instance initialization block or by construtor
*/

/*
2. final static variable
-> The final variable can be assigned only once and it can't be altered later (analogous to const in C++)
-> They can be initialized while creating variable or by static initialization block 
*/

/*
3. final local variable
*/

/*
4 final class
-> final class can't be used to create ChlidClass
*/
/*
5. final methods
-> they can't be overridden in ChildClass
*/

public class L17 {
  public static void main(String []args) {
    Example E1 = new Example();

    
  }
  
}

class Example{
  private final int x = 2; //final instance variable / if you don't initialize x it will be a blank variable
  private final static int y ; // final static variable
  static{
    y =5;
  }
  public void fun(){
    // local variables are blank by default 
    final int k; // final local variable and are also blank 
    
  }

  void somefun(){

  }
}

final class Dummy{

}