package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class VOLUME_OF_CYLINDER {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius and height : ");
        int r=in.nextInt();
        int h=in.nextInt();
        float v=3.14f*(r*r)*h;
        System.out.println("VOLUME OF CYLINDER : "+v);
    }
}
