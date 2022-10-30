
// 18. Write a program to remove the duplicate elements and return the new array

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {-1, 3, 3, 4, -1, 6, -1};
        array = removeDuplicates(array);
        System.out.println(Arrays.toString(array));
    }

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
