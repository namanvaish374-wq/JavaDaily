import java.util.*;
class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
     this.name=name;
     this.id=id;
     this.salary=salary;
    }
     public void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("salary :"+salary); 
    }
}
class Developer extends Employee{
    String language;
    Developer(String name, int id, double salary, String language)
    {
        super(name,id,salary);
        this.language=language;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Language :"+language);
    }

}
class department extends Employee{
    String Department;
    department(String name,int id,double salary,String Department){
        super(name,id,salary);
        this.Department=Department;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department :"+Department);
    }
    public static void main(String arg[])throws Exception{
        Scanner sc=new Scanner(System.in);
        Employee e1 = new Developer("Naman",101,50000,"Java");
        Employee e2 = new department("Rahul",102,80000,"IT");

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
    }
}