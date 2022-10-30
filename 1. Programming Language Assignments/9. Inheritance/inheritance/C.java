package inheritance;

public class C extends B {

    int instanceC1 = 1;
    int instanceC2 = 2;
    int a = 5;


    public void methodC1(){
        System.out.println("methodC1");
    }

    public void methodC2(){
        System.out.println("methodC2");
    }

    @Override
    public void method3(){
        super.method3();
        System.out.println("method3 in C");
    }



}
