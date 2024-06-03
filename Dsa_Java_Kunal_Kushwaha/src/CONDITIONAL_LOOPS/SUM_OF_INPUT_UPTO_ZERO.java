package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class SUM_OF_INPUT_UPTO_ZERO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Elements the elements , if you want to stop give zero : ");
        int a=in.nextInt();
        int s=a;
        while(a!=0){
            System.out.print("Enter : ");
            a=in.nextInt();
            s+=a;
        }
        System.out.println("SUM UPTO ZERO : "+s);
    }
}
