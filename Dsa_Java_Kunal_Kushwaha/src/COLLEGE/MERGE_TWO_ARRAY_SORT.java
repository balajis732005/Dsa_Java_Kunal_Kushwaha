package COLLEGE;
/*
1. How would you find a given two one dimensional array A and B which are sorted in ascending order.
Write a Java program to merge them into a single sorted array, see that it contains every item from
array A and B, in ascending order.
*/
import java.util.Scanner;

public class MERGE_TWO_ARRAY_SORT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array one and two : ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int[] Ar1=new int[n1];
        int[] Ar2=new int[n2];
        System.out.print("Enter the first array elements : ");
        for(int i=0;i<n1;i++){
            Ar1[i]=in.nextInt();
        }
        System.out.print("Enter the elements of array 2 : ");
        for(int i=0;i<n2;i++){
            Ar2[i]=in.nextInt();
        }
        int n=n1+n2;
        int[] Ar3=new int[n];
        int j=0;
        for(int i=0;i<n1;i++){
            Ar3[j]=Ar1[i];
            j++;
        }
        for(int i=0;i<n2;i++){
            Ar3[j]=Ar2[i];
            j++;
        }
        for(int i=0;i<n-1;i++){
            for(int k=i+1;k<n;k++){
                if(Ar3[i]>Ar3[k]){
                    int temp=Ar3[i];
                    Ar3[i]=Ar3[k];
                    Ar3[k]=temp;
                }
            }
        }
        System.out.println("SORTED ARRAY : ");
        for(int i=0;i<n;i++){
            System.out.println(Ar3[i]);
        }
    }
}