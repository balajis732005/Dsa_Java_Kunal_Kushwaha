package ARRAY;

import java.util.Scanner;

public class First_Second_Largest_Smallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int mini1 = arr[0];
        int mini2 = arr[1];
        int maxi1 = arr[0];
        int maxi2 = arr[1];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxi1) {
                maxi2 = maxi1;
                maxi1 = arr[i];
            } else if(arr[i]==maxi1){
                maxi2=maxi1;
            }else if (arr[i] < maxi1 && arr[i] > maxi2) {
                maxi2 = arr[i];
            }
            if (arr[i] < mini1) {
                mini2 = mini1;
                mini1 = arr[i];
            }else if(arr[i]==mini1){
                mini2=mini1;
            }
            else if (arr[i] > mini1 && arr[i] < mini2) {
                mini2 = arr[i];
            }
        }
        System.out.println("FIRST MAX : " + maxi1);
        System.out.println("SECOND MAX : " + maxi2);
        System.out.println("FIRST MINI : " + mini1);
        System.out.println("SECOND MINI : " + mini2);
    }
}