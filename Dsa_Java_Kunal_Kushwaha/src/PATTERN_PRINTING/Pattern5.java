package PATTERN_PRINTING;

import java.util.Scanner;
/*
n=5
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern5(n);
    }
    static void pattern5(int n){
        for(int i=1;i<=((2*n)-1);i++){
            int noofstars=i<=n ? i : n-(i-n);
            for(int j=1;j<=noofstars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
