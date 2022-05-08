// this keyword in java
/*
-> this is a reference variable
-> It is a local variable in instance member methods referring the caller object
-> The this reference to the current object is useful in situations where a local variable hides, or shadows , a field with same name.
-> It is used to represent caller object
-> If a method needs to pass the current object to another method, it can do so using the 'this' reference
-> The 'this' reference cannot be used in a static context , as static code is not executed in the context on any object
-> Constructor also contains 'this' as it is also an instance member

-> It is generally used to resolve name conflicts.
-> It is used to differentiate instance variable and local variable 
-> this.VariableName represents instance member variable
*/


public class L18 {
  public static void main(String []args){
    Box b1 = new Box();
    b1.setDimensions(10, 12, 5);
    b1.sendBox();
    
  }
}

class Box{
  private int l,b,h; // object vars

  public void setDimensions(int l, int b , int h){     // instance member funtion // in this funtion a  'this'  named local variable is present which refers to caller object  
   this.l = l; // this.l is object variable and l is local variable of setDimension(10 in this case)
   this.b = b;
   this.h = h;
  }

  public void sendBox() {
    GiftTaker gf = new GiftTaker();
    gf.receiveGift(this);  // 'this' is referring to caller object i.e b1 in this case
  }

}


class GiftTaker{
  public void receiveGift(Box gift) {
    System.out.println("Gift received");
    
  }
}
