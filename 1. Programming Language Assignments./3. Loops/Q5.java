// 5. Write a program to print largest number among three numbers.

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num, max = Integer.MIN_VALUE;

        for(int i = 0; i < 3; i++){
            System.out.print("Enter the "+ (i + 1) +" number: ");
            num = in.nextInt();
            if(num > max) max = num;
        }

        System.out.println("Max: " + max);

    }
}
