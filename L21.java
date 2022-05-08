// Constructors in Inheritance
/*
-> Constructors are not inherited
-> The Constructor of ChildClass class the Constructor of ParentClass
-> The constructor of Parentclass runs (called by constructor of ChildClass) before constructor of ChildClass (caller) // done by compiler
-> This happens to initialize the member variables of ParentClass , since they are also inherited

-> Explicit call to constructor of ParentClass can be made by using 'super()' . This is done because:-
  <> suppose you want to call the parameterized Constructor of SuperClass because compiler only calls the default constructor // trace out an example by making a parameterized constructor of ParentClass

-> If the ParentCLass doesn't have a default construtor then the programmer must call the constructor from constructor of ChildClass Explicitly (using 'super()')  
  

*/
public class L21 {

  public static  void main(String []args) {

   B obj = new B();
    
  }
  
}
class A{
  int a;
  
  A(){
    
    System.out.println("Constructor of A");

  }

}
class B extends A{

  B(){
    
    //super();  /// will work
    System.out.println("Constructor of B");
    //super();  /// this line will throw an error 
  }

}