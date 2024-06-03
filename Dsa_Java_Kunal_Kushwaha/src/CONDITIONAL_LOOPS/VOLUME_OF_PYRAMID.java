package CONDITIONAL_LOOPS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VOLUME_OF_PYRAMID {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length and width and breadth : ");
        int l=in.nextInt();
        int w=in.nextInt();
        int b=in.nextInt();
        float v=(l*w*b)/3.0f;
        System.out.println("VOLUME OF PYRAMID : "+v);
    }
}
