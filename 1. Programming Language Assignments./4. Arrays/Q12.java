
// 12. Write a method to remove duplicate elements from an array

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {-1, 3, 3, 4, -1, 6, -1};
        removeDuplicatesWithUnSortedNewArray(array);
        System.out.println(Arrays.toString(array));
    }


    // solution with unsorted array
    public static void removeDuplicatesWithUnSortedNewArray(Integer[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = null;
                    break;
                }
            }
        }

    }



    // solution with sorted newArray

    public static void removeDuplicatesWithSortedNewArray(Integer[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) arr[i] = null;
        }

    }


    // solution with newArray
    public static Integer[] removeDuplicates(Integer[] arr) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer i : arr) {
            if (!uniqueNumbers.contains(i)) {
                uniqueNumbers.add(i);
            }
        }
        return uniqueNumbers.toArray(new Integer[]{});
    }
}
