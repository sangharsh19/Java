// Constructors in Java
/*
-> Constructor is a member function of a class
-> It has the same name as the name of the class
-> Constructor has no return type
-> Constructor is automatically invoked when an object of class is created and works as soon as object is created 
-> Constructor is used to initialize variables hence it is safe to say that constructors is what makes an object a object 
-> We can decide what to initialize using constructor     
-> There can be many constructors in a class with different parameters i.e constructor overloading is possible
-> It is not neccessary to create a contructor
-> If you don't create a constructor the compiler automatically creates a constructor it looks like :-
   ClassName(){

   }

*/

public class L13 {
  private int a;

  public L13(){ // non - parameterized Constructor 
    a = 10;
  }
  public L13(int x){ // Parameterized  Constructor 
    a = x;
  }
  
  public static void main(String []args) {
    L13 O1 = new L13(); // constructor called
    
    L13 O2 = new L13(4); // parameterized constructor called

    System.out.println("O1.a = "+O1.a);
    
    System.out.println("O2.a = "+O2.a);
    
  }
}
