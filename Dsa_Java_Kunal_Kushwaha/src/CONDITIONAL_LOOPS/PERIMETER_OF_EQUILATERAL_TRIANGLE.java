package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class PERIMETER_OF_EQUILATERAL_TRIANGLE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side : ");
        int a=in.nextInt();
        float p=3*a;
        System.out.println("PERIMETER OF EQUILATERAL TRIANGLE : "+p);
    }
}
