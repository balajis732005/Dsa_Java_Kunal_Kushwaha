package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class AREA_OF_EQUILATERAL_TRIANGLE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side of triangle : ");
        int a=in.nextInt();
        float Ar=(1.732f/4.0f)*(a*a);
        System.out.println("AREA OF EQUILATERAL TRIANGLE : "+Ar);
    }
}
