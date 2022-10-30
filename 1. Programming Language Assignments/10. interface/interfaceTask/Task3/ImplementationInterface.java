package interfaceTask.Task3;

public class ImplementationInterface implements Interface3 {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }



    public static void main(String[] args) {

        // 3. Use Interface instances to call the implemented method in the implemented class

        Interface3 interface2 = new Interface3() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        interface2.sayHello();

    }


}
