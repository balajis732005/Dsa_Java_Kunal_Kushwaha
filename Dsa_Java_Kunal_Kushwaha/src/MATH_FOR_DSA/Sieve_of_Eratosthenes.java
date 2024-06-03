package MATH_FOR_DSA;

import java.util.Scanner;
//PRINT PRIMES NUMBERS UPTO N
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit  : ");
        int n=in.nextInt();
        boolean[] prime=new boolean[n+1];
        seive(n,prime);
    }
    static void seive(int n,boolean[] prime){
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;                }
            }
        }
        System.out.println("PRIME NUMBER UPTO "+n+" : ");
        for(int i=2;i<n+1;i++){
            if(!prime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
