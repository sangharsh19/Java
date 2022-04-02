// Access modifiers in java
// In java the default modifier is public(4th one) which is simply denoted by not writing anything 
/*
4 types :-
1. Private :- They can't be accessed from outside the class body.
2. Protected :- They can be accessed from any class of same package and child class(inherited) from other package.
3. Public :- They are accessible from any class of any package.
4. Default:- Thet are accessible only from class of same package.
*/
/*
 *Java can also have modifiers for classes unlike C++
 
 *The modifiers for outer class are public and default only .

 *Inner class can have four modifiers

 **Only classes with public modifiers can be accessed in other packages

 ***There can be only one public class (outer class) in a java file
 The name of java file must be the same as name of public class
 Only public class can be accessed 
 
 ***one package can contain many public classes but you have to create a java file for each public class
*/

public class L12 {
  int x; // this vairable has default modifier
  private int y ; // private var
  public int z ; // public var
  protected int a; // protected var 

}
