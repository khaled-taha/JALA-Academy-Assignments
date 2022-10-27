
// 17. Write a method to verify if the array contains two specified elements(12,23)

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {-1, 12, 23, 4, 5, 6};
        boolean verificationUnsortedArray = verificationUnsortedArray(array);
        System.out.println(verificationUnsortedArray);
    }

    public static boolean verificationUnsortedArray(int[] arr) {
        boolean num_12 = false;
        boolean num_23 = false;

        for (int i : arr) {
            if (i == 12) num_12 = true;
            if (i == 23) num_23 = true;

            if (num_12 && num_23) break;
        }
        return num_12 && num_23;
    }


    // solution with sortedArray
    public static boolean verificationSortedArray(int[] arr) {

        Arrays.sort(arr);
        int num_12 = Arrays.binarySearch(arr, 12);
        int num_23 = Arrays.binarySearch(arr, 23);

        return (num_12 != -1 && num_23 != -1);

    }


}
