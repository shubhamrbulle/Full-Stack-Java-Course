package BasicDSA;
/*Find the smallest element in an array
Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array. 

import java.util.*;
public class Smallest {

    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String args[]){

        int arr1[] = {2,5,1,3,0};
        System.out.println("The Smallest element in array is: " +sort(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("The Smallest element in array is: " +sort(arr2));

    }
}

*/

/*
Solution2: Using a min variable

Intuition: We can maintain a min variable which will update whenever the current value is less than the value in the min variable.  

Approach: 

Create a min variable and initialize it with arr[0].
Use a for loop and compare it with other elements of the array
If any element is less than the min value, update min value with element’s value
Print the min variable. */


public class Smallest {
    public static void main(String args[]){
        int arr1[] = {2,5,1,3,0};
        System.out.println("The Smallest element in array is: " +SmallestElement(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("The Smallest element in array is: " +SmallestElement(arr2));
    }
    
    static int SmallestElement(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}


