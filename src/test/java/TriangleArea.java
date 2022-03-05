import java.util.Scanner;

public class TriangleArea {
    public static void main (String [] args){
        System.out.println("+------------------------------------------------------------+" );
        System.out.println("Simple program that allows you to calculate the triangle area" );
        System.out.println("+------------------------------------------------------------+" );
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the length of side A in (cm):" );
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the length of side B in (cm):" );
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the length of side C in (cm):" );
        int c = Integer.parseInt(scanner.nextLine());
        //calling a method with values entered by user.
        TriangleArea(a, b, c);
    }

    public static void TriangleArea(int sideA, int sideB, int sideC ){
    /*
        The area of triangle can be found by following formulas:
           B            1.  a2 + b2 = C2
          /|\           2.  C = 1/2 (AB)
        a/ | \ b        3.  S = 1/2 c * h
        /  |h \
       /___|___\
      A      c   C

     */
        System.out.println("Triangle side A: "+sideA);
        System.out.println("Triangle side B: "+sideB);
        System.out.println("Triangle side C: "+sideC);
        //Calculating the 1/2 length of AC.
        double c = 0.5 * sideC;
        //calculating  h2 = b2 + c2
        double triangleHigh =  Math.pow(sideB, 2) - Math.pow(c,2);
        //Calculating a square root of high.
        double sqrTriangleHight = Math.sqrt(triangleHigh);
        //Print of high
        System.out.println("Calculated triangle high: "+sqrTriangleHight);
        //Calculating triangle area.
        double triangleArea = 0.5 * sideC * sqrTriangleHight;
        System.out.println("Calculated triangle area: "+triangleArea +" cm2");

    }



}
