import java.util.*;
// Arrays in java
/*
-> the syntax for array in java is different as compared to C/C++

-> In java arrays are only created using dynamic memory allocation

-> array can't be blank

*/






public class L28 {

  //int arr[5]; /// error

  public static void main(String []args) {
    
    int arr[] ;    /// reference variable //refering to array

    arr = new int[5]; // 5 can be replaced by a variable

    System.out.println("enter elements in array");
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i<5 ;i++)
    {
      arr[i] = sc.nextInt();
    }

    System.out.println("entered elements : ");
    for(int i = 0; i<5 ;i++)
    {
      System.out.print("element at "+i+" is "+arr[i] +" ");
    }
    System.out.print(" length array "+arr.length);

    // or simply
    // int arr[] = new int[5];
    // int[] arr = new int[5];
    // int[] arr = new int[5]{2,3,4,5,6};
    // int [] arr = {2,3,4,5,7,8};
    
    // int []arr = new int[size]{3,25,6,3,6,} // error
  }
  
}
