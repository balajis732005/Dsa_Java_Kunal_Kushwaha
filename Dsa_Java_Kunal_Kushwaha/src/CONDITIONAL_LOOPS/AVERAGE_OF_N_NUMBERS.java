package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class AVERAGE_OF_N_NUMBERS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=in.nextInt();
        int a;
        int sum=0;
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            a=in.nextInt();
            sum+=a;
        }
        System.out.println("SUM : "+sum);
    }
}
