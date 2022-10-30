
// 13. Write a method to find the second largest number in an array


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {-1,3,3,4,-1,6};
        int SecondLargestNumber = findSecondLargestNumber(array);
        System.out.println(SecondLargestNumber);
    }

    public static int findSecondLargestNumber(int[] arr){
        Arrays.sort(arr);
        return (arr != null && arr.length > 2) ? arr[arr.length - 2] : arr[0];
    }
}
