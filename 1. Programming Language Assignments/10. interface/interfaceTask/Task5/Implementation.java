package interfaceTask.Task5;

public class Implementation implements A, B {

    /*
     If there are two or more same methods in two interfaces and a class implements both interfaces, implementation of the
      method once is enough.
    */

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.sayHello();
    }
}
