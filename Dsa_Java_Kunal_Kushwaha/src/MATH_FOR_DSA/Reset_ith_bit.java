package MATH_FOR_DSA;

import java.util.Scanner;

public class Reset_ith_bit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : "); // 182 -> 10110110
        int n=in.nextInt();
        System.out.print("Enter the bit to Reset : "); // 5th bit to Reset -> 10100110 => 190
        int i=in.nextInt();
        System.out.printf("%d th BIT OF %d IS RESET THEN -> %d",i,n,ithbit(i,n));
    }
    static int ithbit(int i,int n){
        return (n & (~(1<<(i-1))));
    }
}
