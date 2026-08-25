// import java.util.*;
// class Student {

//     String name;
//     int marks;

//     Student(String name, int marks) {
//         this.name = name;
//         this.marks = marks;
//     }

//     void display() {
//         System.out.println(name + " " + marks);
//     }
//    public static void main(String[] args) {
//     ArrayList<Student> students=new ArrayList<>();
//     students.add(new Student("Naman",95));
//     students.add(new Student("Rahul",88));
//     students.add(new Student("Naitik",76));

//     for(int i=0;i<students.size();i++){
//         students.get(i).display();
//     }

//     for(Student s : students){
//     s.display();
//     }
    
//    }
// }

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id , String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String[] args) {
        
    }
}

