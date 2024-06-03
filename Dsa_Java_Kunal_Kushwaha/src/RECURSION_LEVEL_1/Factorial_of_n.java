package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Factorial_of_n {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("FACTORIAL OF "+n+" IS : "+fact(n));
    }
    static int fact(int n){
        if(n==1){
            return n;
        }
        return n * fact(n-1);
    }
}
