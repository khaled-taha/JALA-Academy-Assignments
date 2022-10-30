package interfaceTask.Task8;


public class Implementation implements B {


    @Override
    public void sayHello() {

        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        System.out.println(B.b + " OR " + implementation.b);
        implementation.sayHello();
    }
}
