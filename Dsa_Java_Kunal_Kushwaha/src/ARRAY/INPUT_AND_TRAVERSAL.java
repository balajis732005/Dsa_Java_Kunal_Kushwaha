package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class INPUT_AND_TRAVERSAL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] AR=new int[n];
        AR=new int[n+5];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<AR.length;i++){
            AR[i]=in.nextInt();
        }
        System.out.println("\nMETHOD 1 : ");
        for(int i=0;i<AR.length;i++){
            System.out.print(AR[i]+" ");
        }
        System.out.println("\nMETHOD 2 : ");
        for(int num:AR){
            System.out.print(num+" ");
        }
        System.out.println("\nMETHOD 3 : ");
        System.out.println(Arrays.toString(AR));
        boolean[] now=new boolean[2];
        now[0]=true;
        now[1]=false;
        System.out.println(now[0]);
    }
}
