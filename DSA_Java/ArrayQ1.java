package DSA_Java;

public class ArrayQ1 {
    static void pushZerosToEnd(int arr[],int n){
        int count = 0; // Count of non-zero Elements

        /* Traverse the array. If Element Encountered is Non-zero,
         * then Replace the Element At Index 'Count' with this element 
         */

         for(int i=0;i<n;i++){
            if(arr[i]!=0)
                arr[count++] = arr[i];
                
         }

        //  Now all non-zero elements have been shifted to front and 'count'
        //  is set as index of first 0. Make all Elements 0 from count to end.

        while(count<n){
            arr[count++] =0;
        }
    }

    public static void main(String[] args){
        int arr[] = {1,9,8,4,0,0,2,7,0,6,0,9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
