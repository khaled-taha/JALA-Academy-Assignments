package interfaceTask.Task1;

public class ImplementationInterface implements Interface1{

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ImplementationInterface anInterface = new ImplementationInterface();
        anInterface.sayHello();
    }


}
