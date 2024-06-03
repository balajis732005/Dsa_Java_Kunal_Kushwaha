package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Print_1_to_n_n_to_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        print_both(n);
    }
    static void print_both(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print_both(n-1);
        System.out.println(n);
    }
}
