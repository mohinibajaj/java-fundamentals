package org.example.Inheritance;

class Child extends Parent {

    int number = 20;
    void poop() {
        System.out.println("child is pooping");
    }

//    @Override
    void eat() {
        System.out.println("child eat");
    }

    public static void main(String[] args) {

        Child child = new Child();

        child.eat();
        child.poop();
        System.out.println(child.number);



        // Child child2 = new Parent(); //not possible
        //Parent reference can hold a Child object,
        // but Child reference cannot directly hold a Parent object.

        Parent parent = new Child();
        parent.eat(); //will print Child eat
        // because methods are overridden, and runtime polymorphism chooses the implementation based on the actual object.

//        parent.poop(); //this only exists in child class
        System.out.println(parent.number);
        //Java uses the reference type to decide which field to access
        // hence parent object will be printed
    }
}