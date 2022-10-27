
// 9. Write a function to reverse an array of integer values

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {-1,-2,-3,-4,-5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));

    }

    public static void reverse(int[] arr){
        int temp;
        for(int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
