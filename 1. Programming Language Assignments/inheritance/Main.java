package inheritance;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(a.instanceA1);
        System.out.println(a.instanceA2);
        System.out.println(a.a);
        a.methodA1();
        a.methodA2();
        a.method3();

        System.out.println("##########################");

        System.out.println(b.instanceB1);
        System.out.println(b.instanceB2);
        System.out.println(b.a);
        b.methodB1();
        b.methodB2();
        b.method3();

        System.out.println("##########################");

        System.out.println(c.instanceC1);
        System.out.println(c.instanceC2);
        System.out.println(c.a);
        c.methodC1();
        c.methodC2();
        c.method3();

    }
}