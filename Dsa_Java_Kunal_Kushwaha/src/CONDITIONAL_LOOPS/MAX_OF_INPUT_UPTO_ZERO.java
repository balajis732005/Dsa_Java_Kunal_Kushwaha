package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class MAX_OF_INPUT_UPTO_ZERO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Elements the elements , if you want to stop give zero : ");
        int a=in.nextInt();
        int m=a;
        while(a!=0){
            System.out.print("Enter : ");
            a=in.nextInt();
            if(a>m){
                m=a;
            }
        }
        System.out.println("MAXIMUM ELEMENT UPTO ZERO : "+m);
    }
}
