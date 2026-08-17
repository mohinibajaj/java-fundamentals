package org.example;

public class InterfaceExample implements  InterfaceDemo{

    public static void main(String[] args) {

        InterfaceExample  ife=   new  InterfaceExample();
        ife.method1();
        ife.method3();
        ife.method2();

        InterfaceDemo  ifdemo=   new  InterfaceExample();  //Abstraction + polymorphism + loose coupling.



    }

    @Override
    public void method1() {
        System.out.println("print method 1");
    }

    @Override
    public void method2() {
        System.out.println("print method 2");
    }

    @Override
    public void method3() {
        System.out.println("print method 3");
    }
}
