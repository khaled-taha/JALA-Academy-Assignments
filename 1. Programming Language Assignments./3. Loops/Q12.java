// 12. Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        char gender = new Scanner(System.in).next().charAt(0);

        switch (gender){
            case 'M', 'm' -> System.out.println("Male");
            case 'F', 'f' -> System.out.println("Female");
            default -> System.out.println("invalid input");
        }

    }
}
