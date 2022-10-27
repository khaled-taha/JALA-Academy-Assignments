
// 4. Write a function to test if array contains a specific value

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(contains(array, 2));

    }

    public static boolean contains(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num) return true;
        }
        return false;
    }

}
