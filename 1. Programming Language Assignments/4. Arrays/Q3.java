// 3. Write a program to find the index of an array element

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(getIndex(array, 2));

    }

    public static int getIndex(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num) return i;
        }
        return -1;
    }

}
