package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class DISCOUNT_OF_PRODUCT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the MRP : ");
        float mrp=in.nextFloat();
        System.out.print("Enter the BOUGHT RATE : ");
        float buy=in.nextFloat();
        float dis_am=mrp-buy;
        float dis_per=(100*dis_am)/mrp;
        System.out.println("DISCOUNT PERCENTAGE : "+dis_per);
    }
}