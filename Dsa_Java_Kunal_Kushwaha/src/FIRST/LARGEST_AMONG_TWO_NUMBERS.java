package FIRST;

import java.util.Scanner;

public class LARGEST_AMONG_TWO_NUMBERS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            System.out.println(a+" IS GREATER");
        }
        else{
            System.out.println(b+" IS GREATER");
        }
    }
}
