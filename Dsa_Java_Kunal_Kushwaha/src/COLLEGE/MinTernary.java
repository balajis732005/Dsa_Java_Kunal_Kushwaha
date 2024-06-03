package COLLEGE;

import java.util.Scanner;

public class MinTernary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three numbers : ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int min=(a<b)?a:(b<c)?b:c;
        System.out.println("MIN : "+min);
    }
}
