package MATH_FOR_DSA;

import java.util.Scanner;

public class Find_length_all_num_sys {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=in.nextInt();
        System.out.print("Enter the base : ");
        int base=in.nextInt();
        int ans=(int)(Math.log(num) / Math.log(base)) +1;
        System.out.println("BASE "+base+" : "+ans);
        System.out.println(99/10);
    }
}
