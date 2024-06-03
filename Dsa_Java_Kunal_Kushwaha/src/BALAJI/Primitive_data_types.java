package BALAJI;

import java.util.Scanner;

public class Primitive_data_types {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //PRIMITIVE DATA TYPES
        System.out.print("Enter a string : ");
        String i=input.nextLine();
        System.out.print("Enter a number : ");
        int a=input.nextInt();
        System.out.print("Enter a float : ");
        float b=input.nextFloat();
        System.out.print("Enter a char : ");
        char c=input.next().charAt(0);
        System.out.print("Enter a long integer : ");
        long d=input.nextLong();
        System.out.print("Enter a double : ");
        double e=input.nextDouble();
        System.out.print("Enter a boolean : ");
        boolean f=input.nextBoolean();
        long g=9208398208097898L;
        float h=12.3454738f;
        System.out.println("\nPRIMITIVE DATA TYPES : \n");
        System.out.println("INTEGER : "+a);
        System.out.println("FLOAT : "+b);
        System.out.println("CHAR : "+d);
        System.out.println("DOUBLE : "+e);
        System.out.println("BOOLEAN : "+f);
        System.out.println("GENERATED LONG : "+g);
        System.out.println("GENERATED FLOAT : "+h);
        //NON PRIMITIVE DATA TYPES
        System.out.println("\nNON-PRIMITIVE DATA TYPES : \n");
        System.out.println("STRING : "+i);
    }
}
