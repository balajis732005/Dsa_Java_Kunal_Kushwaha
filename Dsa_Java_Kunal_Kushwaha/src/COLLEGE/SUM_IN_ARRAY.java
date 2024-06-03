package COLLEGE;
//2->ii) Write a java program using array to perform Sum of all values in an array
import java.util.Scanner;

public class SUM_IN_ARRAY {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] AR=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            AR[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=AR[i];
        }
        System.out.println("SUM OF ELEMENTS IN ARRAY : "+sum);
    }
}
