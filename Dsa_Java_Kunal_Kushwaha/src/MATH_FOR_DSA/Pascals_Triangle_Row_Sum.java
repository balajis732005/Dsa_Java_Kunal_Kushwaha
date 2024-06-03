package MATH_FOR_DSA;

import java.util.Scanner;

public class Pascals_Triangle_Row_Sum {
    public static void main(String[] args) {
        /* PASCAL'S TRIANGLE
               1     //0c0
               1 1   //1c0 1c1
               1 2 1  //2c0 2c1 2c2
               1 3 3 1  //3c0 3c1 3c2 3c3
               1 4 6 4 1  //4c0 4c1 4c2 4c3 4c4
               1 5 10 10 5 1 //5c0 5c1 5c2 5c3 5c4 5c5
        */
        /*
               Here -> nc0 + nc1 + nc2 + nc3 + nc4 + ncr = 2^n
        */
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int n=in.nextInt();
        System.out.println(1<<(n-1));
    }
}
