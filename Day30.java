import java.util.*;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {

        if (this.salary > e.salary)
            return 1;

        else if (this.salary < e.salary)
            return -1;

        else
            return 0;
    }

    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

 class Main {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", 45000));
        list.add(new Employee(102, "Aman", 55000));
        list.add(new Employee(103, "Naman", 30000));
        list.add(new Employee(104, "Rohit", 60000));

        System.out.println("Before Sorting:");

        for (Employee e : list) {
            e.display();
        }

        Collections.sort(list);

        System.out.println("\nAfter Sorting:");

        for (Employee e : list) {
            e.display();
        }

    }
}