import java.util.*;
abstract class LibraryItem{
      String title;
      int id;

      LibraryItem(String a, int b){
        this.title=a;
        this.id=b;
      }
      abstract void borrowItem();
      public void display(){
            System.out.println("Title :"+title);
            System.out.println("Id "+id);
      }
}
class Book extends LibraryItem{
      String author;
      Book(String a, int b, String c){
            super(a,b);
            author=c;
      }
      public void borrowItem(){
            System.out.println("BOOK BORROWED SUCCESFULLY");     
      }
      public void display(){
            super.display();
            System.out.println("Author :"+author);
      }
}
class DVD extends LibraryItem{
      String duration;
      DVD(String a, int b, String c){
            super(a,b);
            duration = c;
      }
      public void borrowItem(){
          System.out.println("DVD BORROWED SUCCESSFULLY");
      }
           public void display(){
            super.display();
            System.out.println("Duration :"+duration);
      }
}
class Main{
      public static void main(String[] args) {
            LibraryItem a=new Book("Hello",201,"Naman");
            LibraryItem b=new DVD("Hello",201,"50:50");
            a.borrowItem();
            a.display();
            b.borrowItem();
            b.display();
      }
}


//Exception handling 

class InvalidSalaryException extends Exception{
      InvalidSalaryException(String message){
            super(message);
      }
}
class Employee{
      String name;
      double salary;
      Employee(){
            name="NAMAN";
            salary=0.0;
      }
      public void setSalary(double salary)throws InvalidSalaryException{
       this.salary=salary;
       if(salary<=0){
            throw new InvalidSalaryException("Salary is Incorrect");
       }
       System.out.println("Salary initialized succesfully");
      }
      public double salary(){
            return salary;
      }
      public void display(){
            System.out.println("Employee :"+name);
            System.out.println("Salary :" +salary);
      }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Employee a=new Employee();
      double b=sc.nextDouble();
      try{
            a.setSalary(b);
      }
      catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
      }
   }
}
