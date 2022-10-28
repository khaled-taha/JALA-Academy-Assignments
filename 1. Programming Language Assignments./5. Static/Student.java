public class Student {

    /*1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
         methods and a main method.*/
    static String SCHOOL = "ITI";
    static String ROLE = "STUDENT";

    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 2. Print instance variables in static methods
    // 4. Call instance methods in static methods
    
    /* We cannot access instance members in static methods
       because static methods upload to memory before an instance members.
       So, how do I call the instance member within static methods, and I'm not sure that
       this instance is existing in memory ???!
    */
    static String getSCHOOL(){
        return SCHOOL;
    }

    static String getROLE(){
        return ROLE;
    }

    // 3. Print static variables in Instance methods
    // 5. Call static methods in instance methods

    void printSchool(){
        System.out.println("static variable: " + Student.SCHOOL);
        System.out.println("static methods : " + Student.getSCHOOL());
    }

    void printRole(){
        System.out.println("static variable: " + Student.ROLE);
        System.out.println("static methods : " + Student.getROLE());
    }




    public static void main(String[] args) {
        Student student = new Student("1A", "Khaled");

        // 6. Print all the static, instance variables in main method
        System.out.println("School Name: " + Student.SCHOOL);
        System.out.println("Role Name: " + Student.ROLE);
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);

        // 7. Call static methods and instance methods in main method

        System.out.println("School Name with static methods: " + Student.getSCHOOL());
        System.out.println("Role Name with static methods: " + Student.getROLE());
        student.printSchool();
        student.printRole();



    }
}
