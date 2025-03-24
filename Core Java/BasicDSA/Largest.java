package BasicDSA;

/*Find the Largest element in an array
Problem Statement: Given an array, we have to find the largest element in the array.
 Find the Largest element in an array
Algorithm / Intuition
Solution1: Sorting
Intuition:
We can sort the array in ascending order, hence the largest element will be at the last index of the array. 

Approach: 
Sort the array in ascending order.
Print the (size of the array -1)th index.
DryRun: 
Before sorting: arr[] = {2,5,1,3,0};

After sorting: arr[] = {0,1,2,3,5};

Hence answer : arr[sizeofthearray-1] =5 
The Largest element in the array is: 5
The Largest element in the array is: 10
Algorithm / Intuition
Solution2: Using a max variable
Intuition:
We can maintain a max variable that will update whenever the current value is greater than the value in the max variable.  

Approach: 
Create a max variable and initialize it with arr[0].
Use a for loop and compare it with other elements of the array
If any element is greater than the max value, update max value with the element’s value
Print the max variable.*/

import java.util.*;

public class Largest {

    public static void main(String args[]){
        int arr1[] = {2,5,1,3,0};
        System.out.println("The Largest element in array is: " +sort(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("The Largest element in array is: " +sort(arr2));
    }

    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    
}
