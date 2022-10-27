
// 5. Write a function to remove a specific element from an array

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        array = remove(array, 5);

        System.out.println(Arrays.toString(array));

    }

    public static int[] remove(int[] arr, int num){
        int index = getIndex(arr, num);

        if(index == 0) arr = Arrays.copyOfRange(arr, index + 1, arr.length);
        else{
            for(int i = index + 1; i < arr.length; i++){
                arr[i - 1] = arr[i];
            }
            arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        }

        return arr;

    }

    public static int getIndex(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num) return i;
        }
        return -1;
    }

}
