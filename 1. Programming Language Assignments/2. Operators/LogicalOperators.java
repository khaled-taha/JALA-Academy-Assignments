import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        boolean equalityForThreeNumbers = checkEqualityForThreeNumbers(num1, num2, num3);
        boolean equalityForAnyTwoNumbers = checkEqualityForAnyTwoNumbers(num1, num2, num3);

        if(!equalityForThreeNumbers){
            if(!equalityForAnyTwoNumbers) {
                System.out.println("All numbers are different");
                return;
            }
        }

        System.out.println("There is an equality state among these numbers.");


    }

    public static boolean checkEqualityForThreeNumbers(int num1, int num2, int num3){
        return num1 == num2 && num1 == num3 && num2 == num3;
    }

    public static boolean checkEqualityForAnyTwoNumbers(int num1, int num2, int num3){
        return num1 == num2 || num1 == num3 || num2 == num3;
    }
}
