package FIRST;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=input.nextInt();
        int a=0,b=1;
        System.out.println("FIBONACCI SERIES UPTO "+n+" TERMS : ");
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
