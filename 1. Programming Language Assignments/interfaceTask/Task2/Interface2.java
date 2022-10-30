package interfaceTask.Task2;

// 2. Create an interface with two methods, but implement only one in a class.
// Call the method implemented.

// Answer: We must implement all abstract methods of the interface or
// make one of them an abstract method, another a default.
public interface Interface2 {

    void sayHello();

    default void sayHi(){
        System.out.println("Hi");
    }

}
