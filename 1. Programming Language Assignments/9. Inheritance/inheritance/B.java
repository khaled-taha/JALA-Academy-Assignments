package inheritance;

public class B extends A {

    int instanceB1 = 1;
    int instanceB2 = 2;
    int a = 4;


    public void methodB1(){
        System.out.println("methodB1");
    }

    public void methodB2(){
        System.out.println("methodB2");
    }

    @Override
    public void method3(){
        super.method3();
        System.out.println("method3 in B");
    }


}
