package MATH_FOR_DSA;

import java.util.Scanner;

public class A_Power_B {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base=in.nextInt();
        System.out.print("Enter the power : ");
        int power=in.nextInt();
        System.out.println("ANS : "+power(base,power));
    }
    static int power(int base,int power){
        int ans=1;
        while(power>0){
            if((power & 1) ==  1){
                ans*=base;
            }
            base*=base;
            power = power >> 1;
        }
        return ans;
    }
}
