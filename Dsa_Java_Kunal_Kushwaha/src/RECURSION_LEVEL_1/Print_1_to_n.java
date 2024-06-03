package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        print_rev(n);
    }
    static void print_rev(int n){
        if(n==0){
            return;
        }
        print_rev(n-1);
        System.out.println(n);
    }
}
