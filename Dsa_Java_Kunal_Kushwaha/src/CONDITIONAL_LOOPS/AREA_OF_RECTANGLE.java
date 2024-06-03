package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class AREA_OF_RECTANGLE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length and breadth : ");
        int l=in.nextInt();
        int b=in.nextInt();
        float Ar=l*b;
        System.out.println("AREA OF RECTANGLE : "+Ar);
    }
}
