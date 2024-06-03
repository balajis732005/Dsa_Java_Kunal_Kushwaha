package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class POWER_OF_NUMBER {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number and power : ");
        int num=in.nextInt();
        int po=in.nextInt();
        int ans=power(num,po);
        System.out.println(po+"th POWERE OF "+num+" is : "+ans);
    }
    static int power(int n,int p){
        int re=1;
        for(int i=0;i<p;i++){
            re*=n;
        }
        return re;
    }
}
