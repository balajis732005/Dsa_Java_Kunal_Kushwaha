package MATH_FOR_DSA;

import java.util.Scanner;

public class Power_of_2_or_not {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        boolean ans = (n & (n-1)) == 0;
        System.out.println("POWER OF 2 OR NOT : "+ans);
    }
}
