package RECURSION;
//Print numbers 1 to 5 by calling only one function in main function and that called function should contain only on print statement
public class With_Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
