package MATH_FOR_DSA;

import java.util.Scanner;

public class Set_ith_bit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : "); // 182 -> 10110110
        int n=in.nextInt();
        System.out.print("Enter the bit to set : "); // 4th bit to  set -> 10111110 => 190
        int i=in.nextInt();
        System.out.printf("%d th BIT OF %d IS SET THEN -> %d",i,n,ithbit(i,n));
    }
    static int ithbit(int i,int n){
        return (n | (1<<(i-1)));
    }
}
