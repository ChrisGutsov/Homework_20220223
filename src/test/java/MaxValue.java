import java.util.Scanner;

public class MaxValue {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
         int num1 = Integer.parseInt(scanner.nextLine());
         int num2 = Integer.parseInt(scanner.nextLine());
         int num3 = Integer.parseInt(scanner.nextLine());
         int maxNum = Math.max(num1, Math.max(num2, num3));
        System.out.println(maxNum);


    }


}
