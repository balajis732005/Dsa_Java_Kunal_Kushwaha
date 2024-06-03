package MATH_FOR_DSA;

import java.util.Scanner;

public class Newton_Raphson_Sqrt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.print("Enter the error upto what : ");
        double e=in.nextDouble();
        System.out.println("SQUARE ROOT OF "+n+" UPTO ERROR "+e+" : "+Newton_Sqrt(n,e));
    }
    static double Newton_Sqrt(int n,double e){
        double x=n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root-x) <= e){
                break;
            }
            x=root;
        }
        return root;
    }
}
