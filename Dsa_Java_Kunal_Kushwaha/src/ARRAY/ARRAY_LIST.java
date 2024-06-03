package ARRAY;

import java.util.Scanner;
import java.util.ArrayList;

public class ARRAY_LIST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements list(If you want to stop giving the input then give '-0') : ");
        int n=0;
        while (true) {
            int x=in.nextInt();
            if(x!=(-0)){
                list.add(x);
                n++;
            }
            else{
                break;
            }
        }
        System.out.println("METHOD 1 : \n"+"ELEMENTS : "+list);
        System.out.println("METHOD 2 : \n"+"ELEMENTS : ");
        for(int d:list){
            System.out.print(d+" ");
        }
        //FUNCTIONS
        System.out.print("\nEnter the element find it is present or not : ");
        int c=in.nextInt();
        System.out.println("CONTAINS : "+list.contains(c));
        System.out.print("Enter the index to update : ");
        int ind=in.nextInt();
        System.out.print("Enter new element : ");
        int el=in.nextInt();
        list.set(ind,el);
        System.out.println("AFTER UPDATION : \n"+"ELEMENTS : "+list);
        System.out.print("Enter the element of index to remove : ");
        int ri=in.nextInt();
        list.remove(ri);
        n--;
        System.out.println("AFTER REMOVING : ");
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
