package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Even_Digit_LC_1295 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar;
        Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        System.out.print("No.of Even length Digits : "+evencount(Ar));
    }
    static int evencount(int[] arr){
        int count=0;
        for(int x:arr){
            if(checkeven(x)){
                count++;
            }
        }
        return count;
    }
    static boolean checkeven(int num){
        return checklen2(num)%2 == 0 || checklen1(num)%2 ==0;
    }
    static int checklen1(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
    static int checklen2(int num){
        return (int)(Math.log10(num))+1;
    }
}
