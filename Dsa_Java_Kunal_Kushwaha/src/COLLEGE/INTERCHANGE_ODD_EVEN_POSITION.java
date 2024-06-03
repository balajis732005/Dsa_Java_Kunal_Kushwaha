package COLLEGE;
//7. Implement a program in Java that interchanges the odd and even components in an array.
import java.util.Scanner;

public class INTERCHANGE_ODD_EVEN_POSITION {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] AR=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            AR[i]=in.nextInt();
        }
         for(int i=0;i<n-1;i+=2){
             int temp=AR[i];
             AR[i]=AR[i+1];
             AR[i+1]=temp;
         }
         System.out.println("AFTER RE-ARRANGEMENT : ");
         for(int i=0;i<n;i++){
             System.out.print(AR[i]+ " ");
         }
    }
}
