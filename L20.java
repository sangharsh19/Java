// Static members in Inheritance
/*
-> A class C inherits from its direct superclass all concrete methods m(both static and instance) of the superclass
-> No method declared in C has same signature
-> If a static member function is rewritten in ChildClass then it  is called funtion hiding
-> In case of non- static funtion it is called funtion overloading  

-> It is a compile time error if a static method hides a instance method
-> It is a compile time error if a intance method overrides a static method

** -> static member variables do no inherit (they can be hidden)

*/

public class L20 {
  public static void main(String []args) {

    System.out.println(Child.y); // will output 4 because compiler replaces Child with Parent until Child is invoked 
    Child.fun1();
    
  }
  
}

class Parent{
  static int y = 4;

  public static void fun1() {

    System.out.println("In Parent");
    
  }
}

class Child extends Parent{

  //static int y = 10; // uncomment and see output

  public static void fun1() { // funtions hiding

    System.out.println("In child");
    
  }

 // static{    // un-comment and see output
   // y = 5;
 // }

}



