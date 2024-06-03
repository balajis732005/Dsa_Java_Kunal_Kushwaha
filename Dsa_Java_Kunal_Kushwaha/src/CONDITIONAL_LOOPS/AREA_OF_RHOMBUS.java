package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class AREA_OF_RHOMBUS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the two diagonals of rhombus : ");
        int r1=in.nextInt();
        int r2=in.nextInt();
        float Ar=(r1*r2)/2;
        System.out.println("AREA OF RHOMBUS : "+Ar);
    }
}
