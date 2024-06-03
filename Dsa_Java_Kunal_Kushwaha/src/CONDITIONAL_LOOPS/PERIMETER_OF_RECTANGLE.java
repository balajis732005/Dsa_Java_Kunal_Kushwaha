package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class PERIMETER_OF_RECTANGLE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length and breadth : ");
        int l=in.nextInt();
        int b=in.nextInt();
        float p=2*(l+b);
        System.out.println("PERIMETER OF RECTANGLE : "+p);
    }
}
