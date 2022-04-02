// Lecture 6 // Concept of classes and objects in java
// class is blueprint of objects and objects are used to represent real world entities 

/** More about Class:-
 1. Class is a description of object's properties and behaviour 
 2. Creating class is like creating datatype 
 3. class is defining a category of data 
 */

 /** more about objects:-
  1. Object is a real world entity
  2. Object is an instance of class
  3. Object consumes memory to hold property values
  
  */

  // Syntax of class in Java:-
  class Box{     
    private int length , breadth , height;

    public void setDimensions(int l,int b,int h){
     length = l;
     breadth = b;
     height = h;
    }

    public void showDimensions() {
      //System.out.println("Height = %d breadth = %d height = %d ",length,breadth,height);
      System.out.println("lenght = " +length+ " breadth = "+breadth+ " height = "+height);
    }


  }



public class L6 {

  public static void main(String[] args){

    // creating a referene variable for object
    Box B = new Box(); // here B is holding addres of an object

    B.setDimensions(10,20,30);

    B.showDimensions();

    B = new Box(); // this will create a new object and B will point at it
    // the previous object is now called garbage block
    
    B.showDimensions(); // this will call the function of second object  // run the program to see output
  }
  
}
