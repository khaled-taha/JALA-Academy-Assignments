
// 9. Write a program to find the prime or not.
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        boolean isPrime = true;

        if(num == 0 || num == 1) isPrime = false;

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }

        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");

    }

}
