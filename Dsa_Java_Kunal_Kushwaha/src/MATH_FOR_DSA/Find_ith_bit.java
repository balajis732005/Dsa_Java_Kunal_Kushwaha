package MATH_FOR_DSA;

import java.util.Scanner;

public class Find_ith_bit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : "); // 182 -> 10110110
        int n=in.nextInt();
        System.out.print("Enter the bit : "); // 5th bit of 182 -> 1
        int i=in.nextInt();
        System.out.printf("%d th BIT OF %d IS %S",i,n,ithbit(i,n));
    }
    static int ithbit(int i,int n){
        return (n & (1<<(i-1)))>>i-1;
    }
}
