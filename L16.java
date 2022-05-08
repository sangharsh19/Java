// Overloading and overriding ion Java
/*
---> *Function overloading in Java
-> If two methods of a class (whether both declared in the same class , or both inherited by a class , or one declared and one inherited ) have same name but different signatures that are not same , then the method name is said to be overloaded.
-> Method overloading is a simple way to implement polymorphism.
-> Method overloading doesn't depend on return type only the name should be same and different parameters

---> *Function overriding
-> Method overriding is defining a method in SubClass with same signature with specific implementation in respect to SubClass
-> Both versions can't be in same class (one should be in parent and other should be in child)
-> Overriden method is prioritized





*/

public class L16 {

  public static void main(String [] args) {
    B obj1 = new B();
    A obj2 = new A(); 

    obj1.f1(2);
    obj1.f1(2,3);

    obj2.f2();
    obj1.f2();
  }
  
}
// f1 is used to represent method overloading
// f2 is used to represnt mthod overriding
class A{
  public void f1(int x) {
    System.out.println("In class A");
  }

  public void f2() { // f2 overridded its ancestor
    System.out.println("In class A");
    
  }

}

class B extends A{
  public void f1(int x, int y) {
    System.out.println("In class B");
  }

  public void f2() {
    System.out.println("In class B");
  }
}