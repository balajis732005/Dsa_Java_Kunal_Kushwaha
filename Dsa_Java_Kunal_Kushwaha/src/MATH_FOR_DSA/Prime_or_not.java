package MATH_FOR_DSA;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("PRIME OR NOT : "+check_prime(n));
    }
    static boolean check_prime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c * c <=n){ // c <= sqrt(n) -> c <= n^1/2 -> c^2 <= n -> c*c <= n
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
