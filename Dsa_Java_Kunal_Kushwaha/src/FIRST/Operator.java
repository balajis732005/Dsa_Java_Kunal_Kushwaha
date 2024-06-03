/*Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditio*/
package FIRST;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.print("Enter the operator : ");
        char op=input.next().charAt(0);
        if(op=='+'){
            System.out.println("ADDITION : "+(a+b));
        }
        else if(op=='-'){
            System.out.println("SUBTRACTION : "+(a-b));
        }
        else if(op=='*'){
            System.out.println("MULTIPLICATION : "+(a*b));
        }
        else if(op=='/'){
            System.out.println("DIVISION : "+(a/b));
        }
        else if(op=='%'){
            System.out.println("MODULUS : "+(a%b));
        }
        else{
            System.out.println("INVALID OPERATOR!");
        }
    }
}
