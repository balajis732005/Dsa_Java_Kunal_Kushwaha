package PATTERN_PRINTING;

/*
      4 4 4 4 4 4 4            0 0 0 0 0 0 0
      4 3 3 3 3 3 4            0 1 1 1 1 1 0
      4 3 2 2 2 3 4            0 1 2 2 2 1 0
      4 3 2 1 2 3 4    -> (-4) 0 1 2 3 2 1 0
      4 3 2 2 2 3 4            0 1 2 2 2 1 0
      4 3 3 3 3 3 4            0 1 1 1 1 1 0
      4 4 4 4 4 4 4            0 0 0 0 0 0 0
 */
public class Pattern12 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<(2*n-1);i++){
            for(int j=0;j<(2*n-1);j++){
                int top=i;
                int bottom=(2*n)-i-2;
                int left=j;
                int right=(2*n)-j-2;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }
}
