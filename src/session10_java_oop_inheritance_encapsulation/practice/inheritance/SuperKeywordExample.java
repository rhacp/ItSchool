package session10_java_oop_inheritance_encapsulation.practice.inheritance;

public class SuperKeywordExample {

    public static void main(String[] args) {
        Employee employee = new Employee("Alice", 25, 45533.65);
        employee.display();
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.print("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {

    private double salary;

    public Employee(String name, int age, double salary){
        super(name, age);
        //calling the parent constructor using super;
        this.salary = salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println(", Salary: " + salary);
    }
}
