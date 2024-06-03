package RECURSION_ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

public class Linear_Search_Repeated {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        System.out.print("Enter the elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target=in.nextInt();
        System.out.println("ELEMENT FOUND IN : "+Linear_search_recursion_Repeate(arr,target,0));
    }
    static ArrayList<Integer> Linear_search_recursion_Repeate(int[] arr,int target,int index){
        ArrayList<Integer> ans=new ArrayList<>();
        if(index == arr.length){
            return ans;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        ArrayList<Integer> ansFromBelowCell=Linear_search_recursion_Repeate(arr,target,index+1);
        ans.addAll(ansFromBelowCell);
        return ans;
    }
}
