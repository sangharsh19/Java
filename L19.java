// 'super' keyword in java
/*
-> In inherited class an instance member function of SubClass calls an function of SubClass only , function contains implicit reference variables 'this' and 'super' referring to current Object (object of SubClass)
-> The difference between 'super' and 'this' is
  a.) 'this' reference variable is of Subclass type
  b.) 'super' reference varable is of SuperClass type
-> 'super' is generally used to refer to overridden funtion of Parent class
-> 'super' avoids name conflict between member variables of ParentClass and ChildClass and also local variables
*/
// Parent ka reference variable Child ke object ko refer kar sakta hai but can only access members of Parent class
// which means ke 'super' can't refer to newly created members in SubClass
// 'super' is generally used to refer to overridden funtion of Parent class  
public class L19 {
  public static void main(String[] args ) {
   B obj = new B(); 
   obj.fun1();

  }
}
class A{

    int x;
  
   public void fun1(){
     System.out.println("Class A");
   }
}

class B extends A{

  int x;

  public void fun1() {
    System.out.println("Class B");
    super.fun1();
    //this.fun1();  // this line willl lead to recusrion 
  }

  public void fun2() {
    int x;
    x= 5; // local variable x
    this.x = 4; // variable of SubClass
    super.x = 6; // variable of SuperClass

    
  }
} 
