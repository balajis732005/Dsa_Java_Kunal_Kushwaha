package COLLEGE;
//4->ii) Smallest of three numbers using Ternary Operator
import java.util.Scanner;

public class MINIMUM_OF_THREE_NUMBERS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        //TERNARY OPERATOR
        int min=((a<b)&&(a<c)) ? a : ((b<c) ? b : c);
        System.out.println("MAXIMUM : "+min);
    }
}
