// import java.util.*;

// class Employee implements Comparable<Employee> {

//     int id;
//     String name;
//     double salary;

//     Employee(int id, String name, double salary) {
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }

//     @Override
//     public int compareTo(Employee e) {

//         if (this.salary > e.salary)
//             return 1;

//         else if (this.salary < e.salary)
//             return -1;

//         else
//             return 0;
//     }

//     public void display() {
//         System.out.println(id + " " + name + " " + salary);
//     }
// }

//  class Main {

//     public static void main(String[] args) {

//         ArrayList<Employee> list = new ArrayList<>();

//         list.add(new Employee(101, "Rahul", 45000));
//         list.add(new Employee(102, "Aman", 55000));
//         list.add(new Employee(103, "Naman", 30000));
//         list.add(new Employee(104, "Rohit", 60000));

//         System.out.println("Before Sorting:");

//         for (Employee e : list) {
//             e.display();
//         }

//         Collections.sort(list);

//         System.out.println("\nAfter Sorting:");

//         for (Employee e : list) {
//             e.display();
//         }THIS IS A LOCAL OBJECT POINTER IN EVERY INSTANCE MEMBER FUBCETIOJ IT CONTAUNS THE ADDRESS OF COLLAR OBJECT 
      //THIS POINTER CABNOT BE MODIFIES IT IDUDED TO REFFER COLLAR OBJERT IN MEMEBER FUNCTION  
//CREATE A COUNTER CLASS WUTH A PRIVATE INT COIT MEMBER , AN INCREMENT METHOD THAT DIPALY RETURN TEH COUNTER USING THIS 

// A COUNTER MTHOD THAT SHOWS THE COUNT USING THSI 
//     }
// }

import java.util.*;
class Student implements Comparable<Student>{
    String name ;
    int marks;
    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    public int compareTo(Student s){
      if(s.marks<this.marks)
        return -1;
     else if(s.marks > this.marks)
        return 1;
    else 
        return 0;
    }
    public void display(){
        System.out.println(this.marks+" "+this.name);

    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(new Student("Naman", 200));
        arr.add(new Student("Naitik",100));
        for(Student e : arr){
            e.display();
        }

        Collections.sort(arr);

        System.out.println("helloo after sorting");

        System.out.println(arr);
    }  
}
