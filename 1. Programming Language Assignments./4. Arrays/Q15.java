
// 15. Write a method to find number of even number and odd numbers in an array

public class Main {

    public static void main(String[] args) {

        int[] array = {-1,3,2,4,5,6};
        CountEvensAndOdds(array);
    }

    public static void CountEvensAndOdds(int[] arr){
        int evens = 0;
        int odd = 0;

        for(int i : arr){
            if(i % 2 == 0) evens++;
            else odd++;
        }

        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odd);
    }
}
