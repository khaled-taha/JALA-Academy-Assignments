
// 6. Write a function to copy an array to another array


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int[] arr = copy(array);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] copy(int[] arr){
        int[] array = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            array[i] = arr[i];
        }

        return array;
    }


}
