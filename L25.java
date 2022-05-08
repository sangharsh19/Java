// Interfaces in Java
/*
-> It has similar syntax to a class but uses 'interface' keyword instead of 'class'
-> Interfaces just specify the method declaration (implicity public and abstract) and can only contain fields (which are implicitly oublic static final).
*** some changes after java 9  (like interface can contain static , private and private static methods)
-> Interfaces doesn't have definition of methods but only declaration ending with semicolon after parenthesis
-> All members in interface are public by default and can't be changed into other access modifiers
-> The methods are abstract by default (other methods are not possible)
-> The variables ( aka fields ) are public , static and final by default (can't be modified)
-> Interfaces cannot be instantiated just like abstract class
-> You can create object reference of an interface and it can refer to any of its SubClass type (but cannot refer to new methods and variables)
-> Interface do not have constructors

-> Implementing interfaces
-> To use an interface some Class has to implement it (syntax below)
-> If a class implements an interface and does not define all methods of interface then it must be declared abstract and the methods must be defined by Child of that class

-> Interfaces are used for similar reasons of that an abstract class
->  Multi extension is allowed when extending interfacess i.e. one interface can extend none , one or more interfaces.
-> an class can inherit another class and implement multiple interfaces at the same time (syntax below)


*/

interface I{

  void someFunction();
  
}

class A implements I{

  public void someFunction(){

    // code of that function

  }

  public void fun()
  {
    // some coding
  }

}

class B extends A implements I1,I3{

}


public class L25 {

  public static void main(String []args) {

    System.out.println("Hello");

    I obj = new A();

    obj.someFunction(); // will work
    //obj.fun();  /// error because of obvious resons (see above) 
    
  }
  
}



interface I1{

}

interface I2{

}

interface I3 extends I1,I2{

}
