package RECURSION_ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

public class Linear_Search_Repeated_Best_Approch {
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
        System.out.println("ELEMENT FOUND IN : "+Linear_search_recursion_Repeate_Best(arr,target,0,new ArrayList<Integer>()));
    }
    static ArrayList<Integer> Linear_search_recursion_Repeate_Best(int[] arr,int target,int index,ArrayList<Integer> ans){
        if(index == arr.length){
            return ans;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        return Linear_search_recursion_Repeate_Best(arr,target,index+1,ans);
    }
}
