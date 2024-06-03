package MATH_FOR_DSA;

import java.util.Scanner;

public class Count_the_Set_Bits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        String binary=Integer.toBinaryString(n);
        System.out.println("BINARY REPRESENTATION : "+binary);
        int set=find_no_of_set_bits(n);
        int reset=binary.length()-set;
        System.out.println("NO.OF SET BITS : "+set);
        System.out.println("NO.OF RESET BITS : "+reset);
    }
    static int find_no_of_set_bits(int n){
        int count=0;
        while(n>0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
