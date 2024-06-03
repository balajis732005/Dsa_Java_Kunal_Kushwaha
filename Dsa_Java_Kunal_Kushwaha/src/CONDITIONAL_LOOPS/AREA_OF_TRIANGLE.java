package CONDITIONAL_LOOPS;

import java.util.Scanner;
//IT IS BOTH APPLICABLE FOR ISOSCELES TRIANGLE
public class AREA_OF_TRIANGLE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the base and height of triangle : ");
        int b=input.nextInt();
        int h=input.nextInt();
        float ar=0.5f*(b*h);
        System.out.println("AREA OF TRIANGLE : "+ar);
    }
}
