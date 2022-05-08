// Abstract class in java

/*
-> An abstract class cannot be insatantiated (object creation) but they can be inherited (it can be only used as ParentClass)
-> they have many uses    (consider example of student , faculty and person) 
-> the refernce variable od=f an abstract class can be created (to refer to ChildClass )

-> In C++ an abstract class is created by making atleast one pure virtual function (by using virtual keyword) in class
-> C++ doesn't have 'abstract' keyword

-> Java doesn't have 'virtual' keyword it uses 'abstract' 
-> 'abstract' is written before ClassName in Java to make it an abstract class




*/

public class L23 {
  public static void main(String []args) {

    //A abj = new A(); /// will throw an error
    A obj = new B(); /// valid but obj can only access members of ParentClass
    
  }
}

abstract class A{
  A(){
    System.out.println("A");
  }

}

class B extends A{
  B(){
    System.out.println("B");
  }

}