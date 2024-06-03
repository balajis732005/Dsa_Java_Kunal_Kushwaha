package PATTERN_PRINTING;

import java.util.Scanner;
/*
 n=5
      *****
      *****
      *****
      *****
      *****
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern1(n);
    }
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
