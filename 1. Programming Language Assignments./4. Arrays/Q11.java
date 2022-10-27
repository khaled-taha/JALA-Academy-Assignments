
// 11. Write a program to find the common values between two arrays

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {-1,3,2,4,5,6};
        int[] array2 = {1,7,3,8,4,10};
        ArrayList<Integer> duplicateNumbers = findCommons(array1, array2);
        System.out.println(duplicateNumbers);

    }

    public static ArrayList<Integer> findCommons(int[] arr1, int[] arr2){
        HashSet<Integer> array1 = new HashSet<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        for(int i : arr1) array1.add(i);
        for(int i : arr2){
            if(!array1.add(i)) array2.add(i);
        }

        return array2;
    }
}
