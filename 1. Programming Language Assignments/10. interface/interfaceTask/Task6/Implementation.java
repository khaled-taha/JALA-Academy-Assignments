package interfaceTask.Task6;


public class Implementation implements B {


    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.sayHello();
    }
}
