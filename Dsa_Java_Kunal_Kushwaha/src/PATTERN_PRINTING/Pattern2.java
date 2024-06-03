package PATTERN_PRINTING;

import java.util.Scanner;
/*
n=5
 *
 **
 ***
 ****
 *****
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern2(n);
    }
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
