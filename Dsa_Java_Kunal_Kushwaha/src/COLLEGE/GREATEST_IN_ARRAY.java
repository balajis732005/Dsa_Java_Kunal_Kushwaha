package COLLEGE;
//2->iii) Find the greatest number in an array
import java.util.Scanner;

public class GREATEST_IN_ARRAY {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] AR=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            AR[i]=in.nextInt();
        }
        int max=AR[0];
        for(int i=0;i<n;i++){
            if(AR[i]>max){
                max=AR[i];
            }
        }
        System.out.println("MAXIMUM ELEMENT IN AN ARRAY : "+max);
    }
}
