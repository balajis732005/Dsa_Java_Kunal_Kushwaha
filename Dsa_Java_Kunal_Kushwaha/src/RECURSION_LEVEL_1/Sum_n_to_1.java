package RECURSION_LEVEL_1;

import java.util.Scanner;

public class Sum_n_to_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("SUM OF "+n+" TO 1 IS : "+sum(n));
    }
    static int sum(int n){
        if(n==1){
            return n;
        }
        return n + sum(n-1);
    }
}
