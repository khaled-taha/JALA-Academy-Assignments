import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        // program to print a number between 1 and 100 only
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num < 1 || num > 100) System.out.println("The number is out of the range of [1:100]");
        else if(num >= 1 && num <= 100) System.out.println("The number is in the range of [1:100]");

    }
}
