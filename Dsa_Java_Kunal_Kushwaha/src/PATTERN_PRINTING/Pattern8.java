package PATTERN_PRINTING;

import java.util.Scanner;
/*
n=5
     *
    ***
   *****
  *******
 *********
 */
public class Pattern8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern8(n);
    }
    static void pattern8(int n){
        int temp=1;
        for(int i=1;i<=((2*n)-1);i+=2){
            for(int s=1;s<=(n-temp);s++){
                System.out.print(" ");
            }
            temp++;
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
