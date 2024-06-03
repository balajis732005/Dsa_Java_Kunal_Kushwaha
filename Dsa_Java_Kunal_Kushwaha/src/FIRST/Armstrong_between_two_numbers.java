package FIRST;

import java.util.Scanner;

public class Armstrong_between_two_numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two limits : ");
        int l=input.nextInt();
        int u=input.nextInt();
        System.out.println("ARMSTRONG NUMBERS BETWEEN "+l+" AND "+u+" ARE : ");
        for(int i=l;i<=u;i++){
            Check_ARM(i);
        }
    }
    static void Check_ARM(int x){
        int temp=x;
        int sum=0;
        int l=length(x);
        while(x!=0){
            int rem=x%10;
            sum+=power(rem,l);
            x/=10;
        }
        if(sum==temp){
            System.out.println(sum);
        }
    }
    static int length(int n){
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        return c;
    }
    static int power(int num,int p){
        int re=1;
        for(int i=0;i<p;i++){
            re*=num;
        }
        return re;
    }
}