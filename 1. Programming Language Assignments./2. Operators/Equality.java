import java.util.Scanner;

public class Equality {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Is num1 equal to num2 ? "     + (num1 == num2));
        System.out.println("Is num1 not equal to num2 ? " + (num1 != num2));
    }
}
