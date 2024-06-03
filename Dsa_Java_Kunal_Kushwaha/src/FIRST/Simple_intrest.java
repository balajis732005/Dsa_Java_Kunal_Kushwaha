/*Write a program to input principal, time, and rate (P, T, R) from the user and
  find Simple Interest.*/
package FIRST;

import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a principle : ");
        int p=input.nextInt();
        System.out.print("Enter a rate : ");
        int r=input.nextInt();
        System.out.print("Enter a years : ");
        int n=input.nextInt();
        float re=(p*n*r)/100;
        System.out.println("SI : "+re);
    }
}
