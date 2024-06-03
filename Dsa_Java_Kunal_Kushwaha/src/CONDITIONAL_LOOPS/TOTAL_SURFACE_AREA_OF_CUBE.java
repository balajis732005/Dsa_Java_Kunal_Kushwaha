package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class TOTAL_SURFACE_AREA_OF_CUBE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side of cube : ");
        int a=in.nextInt();
        float t=6.0f*a*a;
        System.out.println("TOTAL SURFACE AREA OF CUBE : "+t);
    }
}
