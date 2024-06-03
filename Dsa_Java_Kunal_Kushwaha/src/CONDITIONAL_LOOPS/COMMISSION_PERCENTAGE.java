package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class COMMISSION_PERCENTAGE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the total profit : ");
        float tot=in.nextFloat();
        System.out.print("Enter the amount to use partner : ");
        float amt=in.nextFloat();
        float per=(100*amt)/tot;
        System.out.print("COMMISSION PERCENTAGE : "+per);
    }
}
