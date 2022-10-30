package abstractClass;

public class Circle extends Shape{

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {

        /*2. Create a sub class for an abstract class. Create an object in the child class for the
             abstract class and access the non-abstract methods*/
        Shape shape = new Shape("RED") {
            @Override
            public double getArea() {
                return -1;
            }
        };
        shape.getArea();



        // 3. Create an instance for the child class in child class and call abstract methods
        Shape shape1 = new Circle("RED", 5);
        System.out.println(shape1.getArea());
        // At compile-time : From the Shape Class
        // At Run-time: Override the one of the abstract class and access the one of the child.


        // 4. Create an instance for the child class in child class and call non-abstract methods
        Circle circle = new Circle("RED", 8);
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());



    }
}
