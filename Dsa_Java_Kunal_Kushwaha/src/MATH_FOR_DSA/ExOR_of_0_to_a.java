package MATH_FOR_DSA;

import java.util.Scanner;

public class ExOR_of_0_to_a {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        if(n%4==0){
            System.out.println("EXOR from 0 to "+n+" : "+n);
        }else if(n%4==1){
            System.out.println("EXOR from 0 to "+n+" : "+1);
        }else if(n%4==2){
            System.out.println("EXOR from 0 to "+n+" : "+(n+1));
        }else if(n%4==3){
            System.out.println("EXOR from 0 to "+n+" : "+0);
        }
    }
}
