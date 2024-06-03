package BALAJI;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //This is input through keyboard
        //We can give input through File or any other
        System.out.print("Enter a string with line keyword : ");
        String str2=input.nextLine();
        System.out.println("WITH LINE KEYWORD : "+str2);
        System.out.print("Enter a number : ");
        int a=input.nextInt();
        System.out.println("A : "+a);
        System.out.print("Enter a float : ");
        float b=input.nextFloat();
        System.out.println("B : "+b);
        System.out.print("Enter a string without line keyword : ");
        String str=input.next();
        System.out.println("WITHOUT LINE KEYWORD : "+str);
    }
}
