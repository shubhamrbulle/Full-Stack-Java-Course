/* Java Program to swap two String without using a temporary variable. */
package DSA_Java;

public class Swap {
    public static void main(String args[]){
        //Declare two Strings
        String a="Hello";
        String b="World";

        //Print String before Swapping 
        System.out.println("String Before Swap: a = " + a + " and b = "+b);

        //append 2nd string to 1st
        a=a+b;

        //Store initial String a in String b
        b=a.substring(0,a.length() - b.length());
        
        //store initial string b in string a
        a=a.substring(b.length());

        //Print String after Swapping
        System.out.println("Strings after swap: a = " +a+ " and b = " +b);
    }
}
