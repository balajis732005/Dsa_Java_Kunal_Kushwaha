package COLLEGE;

public class OddEvenInterchange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        interchangeOddEven(arr);

        System.out.print("Interchanged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void interchangeOddEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // If even
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 != 0) { // If odd
                        // Swap arr[i] and arr[j]
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break; // Break out of inner loop after swapping
                    }
                }
            }
        }
    }
}

