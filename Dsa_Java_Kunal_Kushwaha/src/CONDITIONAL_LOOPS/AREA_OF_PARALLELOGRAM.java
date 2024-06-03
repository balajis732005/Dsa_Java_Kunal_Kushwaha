package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class AREA_OF_PARALLELOGRAM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base and height : ");
        int b=in.nextInt();
        int h=in.nextInt();
        float Ar=b*h;
        System.out.println("AREA OF PARALLELOGRAM : "+Ar);
    }
}
