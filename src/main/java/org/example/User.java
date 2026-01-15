package org.example;


// Using GSON Library
public class User {
    private String name;



    public  User(){

    }
    // this method is to print one line description of the class
    @Override
    public String toString() {
        return "SerialisationAndDeserialisation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double age;

}
