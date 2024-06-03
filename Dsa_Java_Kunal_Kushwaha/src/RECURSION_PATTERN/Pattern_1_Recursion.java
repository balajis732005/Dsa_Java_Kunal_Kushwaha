package RECURSION_PATTERN;

import java.util.Scanner;
/*
n=5
*****
****
***
**
*
 */
public class Pattern_1_Recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern_1(n,0);
    }
    static void pattern_1(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern_1(r,c+1);
        }else{
            System.out.println();
            pattern_1(r-1,0);
        }
    }
}
