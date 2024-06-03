package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class CURVED_SURFACE_AREA_OF_CYLINDER {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius and height : ");
        int r=in.nextInt();
        int h=in.nextInt();
        float c=2.0f*3.14f*r*h;
        System.out.println("CURVED SURFACE AREA OF CYLINDER : "+c);
    }
}
