// Inheritance in java
/*
-> It is done to reuse a given code with modifications .
-> The inherited class is called child class(derived class)(subclass)
-> The variables and fuctions are inherited (taken) from parent class and are present in child class
-> Consider example of Car and Sports car
-> In java there can be only one base class of a class unlike in C++ 
-> Private members of base class cannot be accessed( but are available) by derived class and can only be access indirectly(by public member functions of Base class)
-> Members having Default accessibility in SuperClass are also not accesible by SubClasses in other packages   
-> Java supports :-
    A. Single Inheritance (One  SubClass of one SuperClass)
    B. Multilevel Inheritance (SubClass of SubClass e.g. SchoolStudent of Student of Person)
    C. Hierarchical Inheritance (Multiple Subclasses of a single SuperClass e.g. Employee and Student of Person)
*/
class Car{ // One object of car class can represent one car

  private int price ,fuel,capacity,colour;

  // some fuctions like setPrice() and getPrice()
}

// syntax of inheritance // here Car is parent class(base class)(super class)
class SportsCar extends Car { 
   private int topspeed;
   // some fuctions like setTopSpeed()

   // all variables and fuctions of parent class(Car) are present in SportsCar as well as new members 
}


public class L14 {
  public static void main(String[] args) {
         
  }
}
