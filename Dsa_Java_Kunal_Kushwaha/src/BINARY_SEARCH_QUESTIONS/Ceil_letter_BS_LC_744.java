package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Ceil_letter_BS_LC_744 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the characters : ");
        char[] Ar=in.next().toCharArray();
        System.out.print("Enter the target character : ");
        char target=in.next().charAt(0);
        int index=Ceil_index(Ar,target);
        System.out.print("Element : "+Ar[index]);
    }
    static int Ceil_index(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start%arr.length;
    }
}