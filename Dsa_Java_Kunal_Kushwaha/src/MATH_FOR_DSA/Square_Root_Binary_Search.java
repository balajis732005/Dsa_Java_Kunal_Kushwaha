package MATH_FOR_DSA;

import java.util.Scanner;

public class Square_Root_Binary_Search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.print("Enter the precision : ");
        int p=in.nextInt();
        System.out.printf("SQUARE OF %d IS : %.3f",n,sqrt_Binary(n,p));
    }
    static double sqrt_Binary(int n,int p){
        int start=0;
        int end=n;
        double root= 0.0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid == n){
                return mid; //For perfect Squares
            }else if(mid*mid > n){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root * root <=n){
                root+=incr;
            }
            root-=incr;
            incr/=10; // changing 0.1 -> 0.01 -> 0.001 ........
        }
        return root;
    }
}
