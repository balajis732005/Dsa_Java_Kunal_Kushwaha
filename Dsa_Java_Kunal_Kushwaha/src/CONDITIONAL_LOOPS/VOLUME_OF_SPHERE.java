package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class VOLUME_OF_SPHERE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius of sphere : ");
        int r=in.nextInt();
        float v=(4.0f/3.0f)*3.14f*(r*r*r);
        System.out.println("VOLUME OF SPHERE : "+v);
    }
}
