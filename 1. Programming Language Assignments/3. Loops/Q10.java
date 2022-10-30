// 10. Write a program to palindrome or not.

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int copy = num;

        int palindrome = 0;

        while(copy != 0){
            palindrome = palindrome * 10 +  copy % 10;
            copy /= 10;
        }

        if(num == palindrome) System.out.println("This number is palindrome");
        else System.out.println("This number is not palindrome");

    }
}

