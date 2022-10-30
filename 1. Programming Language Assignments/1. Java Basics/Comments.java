public class Comments {

    public static void main(String[] args) {
        // A program to print your name.
      
         /*
           multi-line
          I will create a method called printName.
          It takes the name and print it.
         */

        printName("Khaled Taha");
    }

    /**
     * documentation comments:<br>
     * Method to print the name.<br>
     * It takes the name as an argument and print it
     * @param name
     * @return void
     */
    public static void printName(String name){
        System.out.println(name);
    }

}
