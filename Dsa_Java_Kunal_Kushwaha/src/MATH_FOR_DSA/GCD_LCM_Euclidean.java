package MATH_FOR_DSA;

import java.util.Scanner;

public class GCD_LCM_Euclidean {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int a=in.nextInt();
        System.out.print("Enter the number 2 : ");
        int b=in.nextInt();
        System.out.println("GCD OF "+a+" and "+b+" is : "+gcd(a,b));
        System.out.println("LCM OF "+a+" and "+b+" is : "+lcm(a,b));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
