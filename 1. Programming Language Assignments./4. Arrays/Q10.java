
// 10. Write a function to find the duplicate values of an array

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] array = {-1,3,3,4,4,6};
        ArrayList<Integer> duplicateNumbers = findDuplicates(array);
        System.out.println(duplicateNumbers);

    }

    public static ArrayList<Integer> findDuplicates(int[] arr){
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        ArrayList<Integer> duplicateNumbers = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(!uniqueNumbers.add(arr[i]))
                duplicateNumbers.add(arr[i]);
        }

        return duplicateNumbers;
    }
}
