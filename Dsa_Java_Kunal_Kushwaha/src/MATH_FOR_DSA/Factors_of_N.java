package MATH_FOR_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors_of_N {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.print("FACTORS OF "+n+" : ");
        factor_optimized(n);
    }
    static void factor_optimized(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i == i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
