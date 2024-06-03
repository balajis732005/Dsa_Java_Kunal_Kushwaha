package PATTERN_PRINTING;

import java.util.Scanner;
/*
n=5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern2(n);
    }
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
