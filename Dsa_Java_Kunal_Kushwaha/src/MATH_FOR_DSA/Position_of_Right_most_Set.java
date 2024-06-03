package MATH_FOR_DSA;

import java.util.Scanner;

public class Position_of_Right_most_Set {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("FIRST SET BIT POSITION FROM LSB : "+Right_most_set(n));
    }
    static int Right_most_set(int n){
        int neg=(~(n))+1;
        return n & neg;
    }
}
