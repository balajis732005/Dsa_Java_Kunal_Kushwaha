package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class VOLUME_OF_PRISM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the height : ");
        int H=in.nextInt();
        System.out.print("Enter the two bases of prism : ");
        int b1=in.nextInt();
        int b2=in.nextInt();
        float B=(H*(b1+b2))/2.0f;//BASE AREA
        float v=B*H;
        System.out.println("VOLUME OF PRISM : "+v);
    }
}
