// 8. Write a program to find Armstrong number or not.

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int copy = num;

        int armstrong = 0;

        while(copy != 0){
            armstrong += (Math.pow(copy % 10, 3));
            copy /= 10;
        }

        if(num == armstrong) System.out.println("This number is armstrong");
        else System.out.println("This number is not armstrong");

    }
}
