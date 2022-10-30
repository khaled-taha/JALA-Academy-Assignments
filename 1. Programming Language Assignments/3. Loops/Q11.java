// 11. Program to check whether a number is EVEN or ODD using switch.

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        switch (num % 2){
            case 0 -> System.out.println("EVEN");
            default -> System.out.println("ODD");
        }

    }
}
