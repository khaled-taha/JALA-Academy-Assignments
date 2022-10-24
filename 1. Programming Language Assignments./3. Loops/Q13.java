// 13. Program for multiple if else statement(Largest number in 10,20 and 30)

public class Q13 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.print("Largest: ");

        if(num1 > num2 && num1 > num3)
            System.out.println(num1);
        else if(num2 > num3)
            System.out.println(num2);
        else
            System.out.println(num3);
    }
}
