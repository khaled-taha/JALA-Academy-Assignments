
// 2. Write a function to calculate the average value of an array of integers

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(getAverage(array));

    }

    public static double getAverage(int[] arr){
        double avg = 0;
        for(int i : arr){
            avg += i;
        }
        
        return avg / arr.length;
    }

}
