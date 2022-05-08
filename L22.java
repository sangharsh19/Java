// Constructor in chaining
/*
-> Constructor of Class can call its own Constructors (differnt parameters) or constructos of ParentCLass such series of invocation of constructors is known as constructor chaining  

-> Constructor call from a constructor must be in first step (call should be in first line)

-> call to both 'super' and 'this' simultaneously is not possible

*/


public class L22 {
  public static void main(String[] args) {

    B obj1 = new B(1);
    
    //B obj2 = new B(1);
    
   // B obj3 = new B();

  }  
  
}

class A{
  public A(){
    System.out.println("A 1");
  }
}

class B extends A{

  public B(){

    //this(3);  /// uncomment and see output /// the compiler doesn't write 'super' when we write 'this' but the construstor of ParentClass will be called because of the parameterized constructor of ChildClass will call it
    System.out.println("B 1");
    //this(3);  // will throw an error 
  }
  public B(int k){

    // super();
    //this();
    /// the above two lines will generate an error (point 3)

    System.out.println("B 2");
  }
}