
// 19. Write a function to find the missing number of sorted array of 1 to 100

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7};
        int missingNumberOfRange = findMissingNumberOfRange(array);
        System.out.println(missingNumberOfRange);
    }

    public static int findMissingNumberOfRange(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(Math.abs(arr[i] - arr[i + 1]) != 1) return arr[i] + 1;
        }
        return 0;
    }
}
