package RECURSION;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        System.out.println("FIBONACCI SERIES OF NTH ELEMENT : "+fibo(n));
    }
    static int fibo(int n){
        if(n<2){ // BASE CONDITION
            return n;
        }
        return fibo(n-1)+fibo(n-2); //REGRESSION
    }
}
