package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class FACTORS_OF_NUMBER {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("FACTORS OF NUMBER "+n+" : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
