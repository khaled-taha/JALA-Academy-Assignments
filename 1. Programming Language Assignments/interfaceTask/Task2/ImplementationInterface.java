package interfaceTask.Task2;

public class ImplementationInterface implements Interface2 {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ImplementationInterface anInterface = new ImplementationInterface();
        anInterface.sayHello();
    }


}
