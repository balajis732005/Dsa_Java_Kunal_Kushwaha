package MATH_FOR_DSA;

public class Single_Occurrence_other_three {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,7,7,8,7,8,8};
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println(sum%3);
    }
}
