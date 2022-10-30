package interfaceTask.Task6;


/*6. Create an interface with a default method and implement it in a class. Do not provide
implementation to the default method and call the method.*/
public interface B {

   default void sayHello(){
       // A default method in Java 8 is a method defined with a method body using default keyword inside an interface
      // body
   }
}
