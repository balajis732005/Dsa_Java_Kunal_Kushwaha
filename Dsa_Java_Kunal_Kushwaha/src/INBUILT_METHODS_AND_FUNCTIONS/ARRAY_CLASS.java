package INBUILT_METHODS_AND_FUNCTIONS;

import java.util.Arrays;

public class ARRAY_CLASS {
    public static void main(String[] args) {
        //1.ARRAYS.SORT(<ARRAY_NAME>) FOR NUMBERS. -> PERFORMS QUICK SORT
        int[] arr={5,4,3,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //2.ARRAYS.SORT(<ARRAY_NAME>) FOR CHARACTER.
        char[] alpha={'d','e','a','t','z','r','d','a','b'};
        Arrays.sort(alpha);
        System.out.println(Arrays.toString(alpha));

        //3.ARRAYS.SORT(<ARRAY_NAME>) FOR STRING.
        String[] str={"balaji","vijay","rohit","aravind","shyam","akilesh"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        //4.ARRAYS.FILL(<ARRAY_NAME>,VALUE)
        int[] a=new int[5];
        Arrays.fill(a,2);
        System.out.println(Arrays.toString(a));

        //5.CONVERT ARRAY TO STRING -> ARRAYS.TOSTRING(<ARRAY_NAME>)
        int[] b={1,3,5,2,5,7,9,4,10,35};
        String s=Arrays.toString(b);
        System.out.println(s);

        //6.COPY THE ARRAY -> ARRAYS.COPYOF(<OLD_ARRAY_NAME>,<NEW_ARRAY_LENGTH>)
        int[] c={4,29,75,48,39,45,48,53,749,74899};
        int[] copy_c=Arrays.copyOf(c,c.length);
        System.out.println(Arrays.toString(copy_c));
        int[] copy_range_c=Arrays.copyOfRange(c,1,5); //(old_array,start,end+1)
        System.out.println(Arrays.toString(copy_range_c));

        //7.ARRAYS.BINARYSEARCH(<ARRAY_NAME>,<TARGET>)
        int[] d={1,2,3,4,5,6,7};
        int ind=Arrays.binarySearch(d,6);
        System.out.println(ind);

        //8.ARRAYS.COMPARE(<ARRAY_NAME_1>,<ARRAY_NAME_2>)
        int[] a1={1,3};
        int[] a2={1,2,3,4};
        System.out.println(Arrays.compare(a1,a2)); // a1.length-a2.length
        int[] a3={2,2,3,8,2,6,0,3,5};
        System.out.println(Arrays.compare(a2,1,3,a3,1,3));
        /*
            It returns 0 if the array is equal to the other array.
            It returns a value less than 0 is returned if the array is lexicographically  less than the other array in
            It returns a value greater than 0 if the array is lexicographically greater than the other array (more characters).
         */
        int[] b1={-1,-4,-5,-3,-2,0,1,5,8,7,9};
        int[] b2={-1,-4,-5,-3,-2,0,1,5,8,7,9};
        System.out.println(Arrays.compareUnsigned(b1,0,b1.length,b2,0,b2.length));

        //9.ARRAYS.EQUALS(<ARRAY_NAME_1>,<ARRAY_NAME_2>)
        int[] c1={1,2,3,4,5};
        int[] c2={1,2,3,4,5};
        int[] c3={1,2,3,6,7,8,9,0};
        System.out.println(Arrays.equals(c1,c2));
        System.out.println(Arrays.equals(c2,0,3,c3,0,3));

        //10.ARRAYS.HASHCODE(<ARRAY_NAME>)
        System.out.println(Arrays.hashCode(c1));

        //11.ARRAYS.MISMATCH(<ARRAY_NAME_1>,<ARRAY_NAME_2>)
        System.out.println(Arrays.mismatch(c1,c2));
        System.out.println(Arrays.mismatch(c2,c3));
        System.out.println(Arrays.mismatch(c2,1,5,c3,2,6));
        /*
            Return -1: If both the arrays have same elements at all the corresponding positions.
            non-negative integer: The index at which both the arrays have first unequal elements.
         */

        //11.ARRAYS.PARALLELSORT(<ARARY_NAME>) -> PERFORMS MERGE SORT
        int[] e={3,7,1,5,9,2,5,7,0,-1,-7};
        Arrays.parallelSort(e);
        System.out.println(Arrays.toString(e));
        int[] f={1,-1,3,-5,-7,0,9,3,4,5};
        Arrays.parallelSort(f,2,7);
        System.out.println(Arrays.toString(f));
    }
}
