package Myclasses_MJ;

class Employee1 {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("And My name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class Costum_Class {
    public static void main(String[] args) {
        Employee1 Mujahid = new Employee1();
        Employee1 Ajmal = new Employee1();

        Mujahid.name = "Mujahid Ur Rehman";
        Mujahid.id = 134;
        // System.out.println(Mujahid.name);
        Mujahid.printDetails();
        Mujahid.salary = 30;
        System.out.println("The salary of " + Mujahid.name + " is " + Mujahid.getSalary());
        Ajmal.name = "Mohammed Ajmal Siddiqui";
        Ajmal.id = 176;
        Ajmal.salary = 34;
        Ajmal.printDetails();
        System.out.println("The salary of " + Ajmal.name + " is " + Ajmal.getSalary());
    }

}
