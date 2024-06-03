package MATH_FOR_DSA;

import java.util.Scanner;

public class ExOR_of_a_to_b {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit 1 : ");
        int a=in.nextInt();
        System.out.print("Enter the Limit 2 : ");
        int b=in.nextInt();
        int ans=Exor_0_a(b)^Exor_0_a(a-1);
        System.out.println("EXOR of "+a+" to "+b+" is : "+ans);
    }
    //Exor of 0 to a
    static int Exor_0_a(int a){
        if(a%4==0){
            return a;
        }else if(a%4==1){
            return 1;
        }else if(a%4==2){
            return a+1;
        }
        return 0;
    }
}
