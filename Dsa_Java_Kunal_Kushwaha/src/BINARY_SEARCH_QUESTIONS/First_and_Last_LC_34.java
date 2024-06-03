package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;
import java.util.Arrays;

public class First_and_Last_LC_34 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();
        int[] Ar;
        Ar = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            Ar[i] = in.nextInt();
        }
        System.out.print("Enter the target element : ");
        int s = in.nextInt();
        int[] range=answer(Ar,s);
        System.out.println(Arrays.toString(range));
    }
    static int[] answer(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=rangeofnum(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=rangeofnum(arr,target,false);
        }
        return ans;
    }
    static int rangeofnum(int[] arr,int target,boolean firstelementsearch){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]) {
                start = mid + 1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                ans=mid;
                if(firstelementsearch){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
