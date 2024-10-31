package OOP.serialization;

import java.io.Serializable;

public class Acc implements Serializable {
    private String name;
    private int age;
    private double salary;

    public Acc() {
        this("Test",50,15000);
    }
    public Acc(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


}
