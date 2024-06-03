package RECURSION_PATTERN;

import java.util.Scanner;
/*
 *
 **
 ***
 ****
 *****
 */
public class Pattern_2_Recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        pattern_2(n,0);
    }
    static void pattern_2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            pattern_2(r,c+1);
            System.out.print("*");
        }else{
            pattern_2(r-1,0);
            System.out.println();
        }
    }
}
