package MATH_FOR_DSA;

import java.util.Scanner;

public class Magic_number_nth {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n=in.nextInt();
        System.out.print("Enter the base : ");
        int base=in.nextInt();
        System.out.println("Magic number : "+Magic_number(n,base));
    }
    static int Magic_number(int n,int base){
        int ans=0;
        while(n>0){
            int last = n & 1;
            ans+=(last*base);
            base*=5;
            n= n>>1;
        }
        return ans;
    }
}
