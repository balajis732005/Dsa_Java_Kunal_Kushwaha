/*Write a program to print whether a number is even or odd, also take
  input from the user.*/
package FIRST;

import java.util.Scanner;

public class EVEN_ODD {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a  number : ");
        int n=input.nextInt();
        if(n%2==0){
            System.out.println(n+" is EVEN");
        }
        else{
            System.out.println(n+" is ODD");
        }
    }
}
