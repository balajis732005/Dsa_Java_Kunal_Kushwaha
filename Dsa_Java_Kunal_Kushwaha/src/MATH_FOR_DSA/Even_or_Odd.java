package MATH_FOR_DSA;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        if(isOdd(n)){
            System.out.printf("%d is Odd Number\n",n);
        }else{
            System.out.printf("%d is Even Number\n",n);
        }
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
