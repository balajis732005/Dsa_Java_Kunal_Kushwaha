package PATTERN_PRINTING;

import java.util.Scanner;
/*
n=5
    *
   * *
  * * *
 * * * *
* * * * *

 */
public class Pattern10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern10(n);
    }
    static void pattern10(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=(n-i);s++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
