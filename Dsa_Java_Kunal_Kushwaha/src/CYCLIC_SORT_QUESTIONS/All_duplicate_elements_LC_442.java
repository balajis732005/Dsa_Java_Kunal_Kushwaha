package CYCLIC_SORT_QUESTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//ELEMENTS 1 TO N
public class All_duplicate_elements_LC_442 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans=find_all_duplicate_element(Ar);
        int[] ans_arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans_arr[i]=ans.get(i);
        }
        System.out.println("DUPLICATE ELEMENTS : "+ Arrays.toString(ans_arr));
    }
    static ArrayList<Integer> find_all_duplicate_element(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        cyclic_sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    static void cyclic_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}
