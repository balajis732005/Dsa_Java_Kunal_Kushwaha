package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class AREA_OF_CIRCLE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float r=input.nextFloat();
        double ar=3.14*(r*r);
        System.out.println("AREA OF CIRCLE : "+ar);
    }
}
