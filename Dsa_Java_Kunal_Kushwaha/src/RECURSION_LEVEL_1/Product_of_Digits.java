package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Product_of_Digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("SUM OF DIGITS "+n+" IS : "+product_digit(n));
    }
    static int product_digit(int n){
        if(n==0){
            return 1;
        }
        return n%10 * product_digit(n/10);
    }
}
