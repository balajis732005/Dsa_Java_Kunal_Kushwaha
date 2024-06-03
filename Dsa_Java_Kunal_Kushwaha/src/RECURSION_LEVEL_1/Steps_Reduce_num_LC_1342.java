package RECURSION_LEVEL_1;

import java.util.Scanner;
/*if the number is even -> n/2
  if the number is odd -> n-1
  do this until we get Zero and count no.of steps required
 */
public class Steps_Reduce_num_LC_1342 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("NO.OF STEPS TO REDUCE "+n+" : "+Reduce_count(n));
    }
    static int Reduce_count(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return helper(n/2 , count+1);
        }
        return helper(n-1 , count+1);
    }
}
