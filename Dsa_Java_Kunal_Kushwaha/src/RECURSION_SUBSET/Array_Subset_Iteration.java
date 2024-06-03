package RECURSION_SUBSET;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Subset_Iteration {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter te size of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(subset(arr));
    }
    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int len=outer.size();
            for(int i=0;i<len;i++){
                ArrayList<Integer> inter=new ArrayList<>(outer.get(i));
                inter.add(num);
                outer.add(inter);
            }
        }
        return outer;
    }
}
