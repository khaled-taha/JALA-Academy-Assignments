
// 1. Write a function to add integer values of an array

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
       array =  addToArray(array, new int[]{6,7,8,9,10,11});
        for(int i = 0 ; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static int[] addToArray(int[] arr, int ... nums){
        int[] newArray = new int[arr.length + nums.length];

        int i = 0;

        for( ; i < arr.length; i++){
            newArray[i] = arr[i];
        }

        for(int j = 0; j < nums.length; j++){
            newArray[i++] = nums[j];
        }
        return newArray;
    }

}
