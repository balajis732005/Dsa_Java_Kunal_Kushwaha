package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("SUM OF DIGITS "+n+" IS : "+sum_digit(n));
    }
    static int sum_digit(int n){
        if(n==0){
            return n;
        }
        return n%10 + sum_digit(n/10);
    }
}
