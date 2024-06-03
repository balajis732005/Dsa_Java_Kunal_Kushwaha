package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Richest_wealth_LC_1672 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter no of rows and columns : ");
        int r=in.nextInt();
        int c=in.nextInt();
        System.out.print("Enter the Array : ");
        int[][] Ar=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Ar[i][j]=in.nextInt();
            }
        }
        System.out.print("Richest Wealth of customer : "+Rich_wealth(Ar));
    }
    static int Rich_wealth(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
