//Java Program to Generate a Random Integer within this Specific Range
package DSA_Java;

import java.util.concurrent.ThreadLocalRandom;

public class GRandomNumbers {
    public static int getRandomValue(int Min, int Max){
        //Get and return the Random Integer within Min and Max
        return ThreadLocalRandom.current().nextInt(Min,Max+1);
    }

    //Driver code
    public static void main(String args[]){
        int Min = 1, Max =100;
        System.out.println("Random value between "+Min+" and " +Max+ " : " +getRandomValue(Min,Max));
    }

    
}
