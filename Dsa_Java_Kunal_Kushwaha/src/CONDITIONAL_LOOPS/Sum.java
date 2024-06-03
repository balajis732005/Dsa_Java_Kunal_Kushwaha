package CONDITIONAL_LOOPS;

import java.util.Scanner;
//WE CAN GIVE INTEGER IF A VARIABLE IS DECLARED AS FLOAT.
//BUT WE CAN'T GIVE FLOAT IF A VARIABLE IS DECLARED AS INTEGER.
public class Sum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter for Integer asking : ");
        float a=input.nextInt();
        float b=input.nextInt();
        System.out.println("Enter for Float asking : ");
        float c=input.nextFloat();
        float d=input.nextFloat();
        System.out.println("SUM1 : "+(a+b));
        System.out.println("SUM2 : "+(c+d));
    }
}
