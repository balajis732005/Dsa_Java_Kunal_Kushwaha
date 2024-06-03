package COLLEGE;
//9. Create a simple Java program to implement basic Calculator operations.
import java.util.Scanner;

public class CALCULATOR {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean choice=true;
        int a,b;
        char op;
        while(choice){
            System.out.print("Enter two operands : ");
            a=in.nextInt();
            b=in.nextInt();
            System.out.print("Enter the operand : ");
            op=in.next().charAt(0);
            switch(op){
                case '+' -> System.out.println("ADDITION : "+(a+b));
                case '-' -> System.out.println("SUBTRACTION : "+(a-b));
                case '*' -> System.out.println("MULTIPLICATION : "+(a*b));
                case '/' -> System.out.println("DIVISION : "+(a/b));
                case '%' -> System.out.println("REMAINDER : "+(a%b));
                default -> System.out.println("INVALID OPERATOR!");
            }
            System.out.print("DO YOU WANT TO CONTINUE(true/false) : ");
            choice=in.nextBoolean();
        }
    }
}
