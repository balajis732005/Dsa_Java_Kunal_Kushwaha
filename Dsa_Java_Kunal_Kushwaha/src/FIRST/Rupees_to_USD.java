package FIRST;

import java.util.Scanner;

public class Rupees_to_USD {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the rupees : ");
        float rup=input.nextFloat();
        float usd=rup*0.012f;
        System.out.println("USD : "+usd);
    }
}
