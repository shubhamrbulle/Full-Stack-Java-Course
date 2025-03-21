//Java Program to Reverse a String Preserving Spaces.
package DSA_Java;

public class ReverseStringPreserveSpace {
    
    static void reverses(String str){

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];
        //Mark spaces in result 
        for (int i = 0; i < inputArray.length; i++){
            if(inputArray[i]==' '){
                result[i]=' ';
            }
        }
        //Traverse input String from beginning and put characters in result from end

        int j = result.length-1;
        for(int i=0; i < inputArray.length; i++){
            
            // Ignore spaces in input string 
            if (inputArray[i] != ' ') { 

            //ignore spaces in result.
            if(result[j]==' '){
                j--;
            }
            result[j] = inputArray[i];
            j--;
        }
    } 
    System.out.println(String.valueOf(result));
}


    public static void main(String args[]){
        reverses("India is my country");

    }   
}
