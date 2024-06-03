package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class PERIMETER_OF_SQUARE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int a=in.nextInt();
        float p=4*a;
        System.out.println("PERIMETER OF SQUARE : "+p);
    }
}
