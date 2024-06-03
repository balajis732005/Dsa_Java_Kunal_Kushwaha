package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("REVERSE OF "+n+" IS : "+reverse_digit(n));
    }
    static int reverse_digit(int n){
        int digit=(int)(Math.log10(n)+1);
        return helper(n,digit);
    }
    static int helper(int n,int digit){
        if(n%10 == n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,digit-1)) + helper(n/10,digit-1);
    }
}
