package COLLEGE;

public class INFINITE_LOOP {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        while(n>5)
        {
            i=i*2;
            n=n+2;
        }
        System.out.println(i);
    }
}
