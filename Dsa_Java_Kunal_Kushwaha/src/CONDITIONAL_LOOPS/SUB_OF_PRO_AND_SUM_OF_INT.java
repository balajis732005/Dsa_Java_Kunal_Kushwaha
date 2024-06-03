package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class SUB_OF_PRO_AND_SUM_OF_INT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        int temp=n;
        int s=0,p=1;
        while(n!=0){
            int rem=n%10;
            p*=rem;
            s+=rem;
            n/=10;
        }
        System.out.println("PRODUCT OF DIGIT : "+p);
        System.out.println("SUM OF DIGIT : "+s);
        System.out.println("SUBTRACTION OF PRODUCT AND SUM OF THE GIVEN INTEGER : "+(p-s));
    }
}
