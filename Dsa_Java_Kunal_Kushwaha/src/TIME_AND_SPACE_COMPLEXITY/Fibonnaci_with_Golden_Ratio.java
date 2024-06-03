package TIME_AND_SPACE_COMPLEXITY;

import java.util.Scanner;

public class Fibonnaci_with_Golden_Ratio {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        System.out.printf("FIBONACCI SERIES FORM 0 TO %d : \n",n);
        for(long i=0;i<n;i++){
            System.out.print(fiboformula(i)+" ");
        }
    }
    static long fiboformula(long n){
        return (long)(((Math.pow(((1+Math.sqrt(5))/2),n))-(Math.pow(((1-Math.sqrt(5))/2),n)))/(Math.sqrt(5)));
    }
}
