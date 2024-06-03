package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class ELECTRICITY_BILL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the unit consumed : ");
        int unit=in.nextInt();
        double bill;
        if(unit<=100){
            bill=unit*1.2;
        }
        else if(unit<=200){
            bill=(100*1.2)+((unit-100)*2.4);
        }
        else if(unit<=300){
            bill=(100*1.2)+(200*2.4)+((unit-200)*3.6);
        }
        else if(unit<=400){
            bill=(100*1.2)+(200*2.4)+(300*3.6)+((unit-300)*4.8);
        }
        else if(unit<=500){
            bill=(100*1.2)+(200*2.4)+(300*3.6)+(400*4.8)+((unit-400)*5);
        }
        else{
            bill=5000.0;
            System.out.println("AMOUNT CROSSED ABOVE LIMIT!");
            System.out.println("BILL AMOUNT : "+bill);
            return;
        }
        System.out.println("BILL AMOUNT : "+bill);
    }
}
