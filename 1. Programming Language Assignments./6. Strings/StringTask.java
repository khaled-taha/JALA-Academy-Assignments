

public class StringTask {

    public static void main(String[] args) {

        // 1. Different ways creating a string
        String s1 = "Way 1";
        String s2 = new String("Way2");

        // 2. Concatenating two strings using + operator
        String concatenation = s1 + s2;

        // 3. Finding the length of the string
        int length = concatenation.length();

        // 4. Extract a string using Substring
        String way1 = concatenation.substring(0, 5);


        // 5. Searching in strings using indexOf()
        int indexOfDigit = concatenation.indexOf("1");

        // 6. Matching a String Against a Regular Expression With matches()
        boolean containAnyDigit = concatenation.matches("(.*)[0-9]+(.*)");

        //7. Comparing strings using the methods equals()
        boolean equalMethod = s1.equals(s2);

        // 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
        boolean equalsIgnoreCase = s1.equalsIgnoreCase("WAY 1");
        boolean startsWith = concatenation.startsWith("Way 1");
        boolean endsWith = concatenation.endsWith("2");
        int compareTo = s1.compareTo(s2);


        // 9. Trimming strings with trim()
        String trim = "   Khaled  ".trim();

        // 10. Replacing characters in strings with replace()
        String newString = concatenation.replace("ay", "AY");


        // 11. Splitting strings with split()
        String[] strings = concatenation.split("[0-9]"); // get all way words only without digits

        // 12. Converting Numbers to Strings with valueOf()
        String digit_11 = String.valueOf(1) + 1; // 11

        // 13. Converting integer objects to Strings

        Integer[] digits = {1,2,3,4,5};
        String number_12345 = "";

        for(Integer i : digits){
            number_12345 += i.toString();
        }


        // 14. Converting to uppercase and lowercase
        String upperCase = concatenation.toUpperCase();
        String lowerCase = concatenation.toLowerCase();
    }
}
