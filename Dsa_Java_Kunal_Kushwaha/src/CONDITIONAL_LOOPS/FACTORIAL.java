package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class FACTORIAL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("FACTORIAL OF "+n+" IS : "+f);
    }
}
