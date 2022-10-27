
// 7. Write a function to insert an element at a specific position in the array

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        array = insert(array, 6, 5);

        System.out.println(Arrays.toString(array));

    }

    public static int[] insert(int[] arr, int index, int num){
        int[] array = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            array[i] = arr[i];
        }

        for(int i = arr.length; i > index; i--){
            array[i] = array[i - 1];
        }

        array[index] = num;

        return array;
    }


}
