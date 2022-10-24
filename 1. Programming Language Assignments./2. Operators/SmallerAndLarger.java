public class SmallerAndLarger {

    public static void main(String[] args) {

        int[] arr = {5,-1,8,79,10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
