import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main (String [] args){
        int arrayLength;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the length of Random array: ");
        arrayLength = scanner.nextInt();
       RandomNumbersArray(arrayLength);

    }
    public static void RandomNumbersArray (int getArrayLength){

        int [] randomArray = new int[getArrayLength];
        for(int i = 0; i<getArrayLength; i++ ){
            randomArray[i] = (int) (Math.random()*100);
        }

        System.out.println("Array of random numbers, " +getArrayLength +" numbers long, the elements are: " + Arrays.toString(randomArray));

    }
}
