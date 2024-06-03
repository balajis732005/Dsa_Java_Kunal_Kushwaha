package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Count_Zeros_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("NO.OF ZEROS IN "+n+" : "+Zero_count(n));
    }
    static int Zero_count(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return helper(n/10 , count+1);
        }
        return helper(n/10 , count);
    }
}
