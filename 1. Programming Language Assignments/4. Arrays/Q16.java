
// 16. Write a function to get the difference of largest and smallest value

public class Main {

    public static void main(String[] args) {

        int[] array = {-1,3,2,4,5,6};
        int differenceBetweenMaxAndMin =  differenceBetweenMaxAndMin(array);
        System.out.println(differenceBetweenMaxAndMin);
    }

    public static int differenceBetweenMaxAndMin (int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        return max - min;
    }
}
