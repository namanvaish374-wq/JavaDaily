// import java.util.*;
// interface shape{
//     double area();
//     void display();
// }
// class Circle implements shape{
//     int radius;
//     Circle(int a){
//        radius =a;
//     }
//   public  double area()
//     {
//         return(3.14*radius*radius);
//     }
//     public void display(){
//         double x=area();
//         System.out.println("Area of circle is "+ x);
//     }
// } 
// class Rectangle implements shape{
//     int length,width;
//     Rectangle(int a, int b){
//         length=a;
//         width=b;
//     }
//      public double area(){
//       return(length * width);
//     }
//     public void display(){
//         double y=area();
//         System.out.println("Area of rectangle is:"+y);
//     }
// public static void main(String arg[])throws Exception{
//     Scanner sc=new Scanner(System.in);
//     shape s1 = new Circle(5);
//     shape s2 = new Rectangle(4, 6);

//     s1.display();
//     s2.display();
    
//   }  
// }


// import java.util.*;
// interface Bank
// {
//    void deposit(double amount);
//    void withdraw(double amount);
//    void checkBalance();
// }
// class SBI implements Bank{
//     double balance;
//     SBI(double a)
//     {
//         balance =a;
//     }
//      public void deposit(double amount){
//      System.out.println("Deposited :"+amount);
//      balance=balance+amount;
//     }
//     public void withdraw(double amount){
//      balance=balance-amount;
//      System.out.println("Withdrawn  :"+ amount);
//     }
//     public void checkBalance(){
//         System.out.println("Current Balance :"+balance);
//     }
//     public static void main(String arg[])throws Exception{
//      Bank obj=new SBI(5000);
//      obj.deposit(2000);
//      obj.withdraw(1000);
//      obj.checkBalance();
//     }
// }


import java.util.*;
interface Employee{
    double calculateSalary();
    void displayDetails();

}
class FullTimeEmployee implements Employee{
    String name;
    int monthlySalary;
    FullTimeEmployee(String a,int m){
        monthlySalary=m;
        name=a;
    }
   public double calculateSalary(){
    return monthlySalary;
   }
   public void displayDetails(){
    System.out.println("Employee Type :  Full Time");
    System.out.println("Name :"+name);
    System.out.println("salary :"+ calculateSalary());
   }
}
class PartTimeEmployee  implements Employee{
  String name;
  double hoursworked,hourlyRate;
  PartTimeEmployee(String a,double b,double c){
    name=a;
    hoursworked=b;
    hourlyRate=c;
  }
    public double calculateSalary(){
    double salary=hoursworked * hourlyRate;
    return salary;

  }
  public void displayDetails(){
    System.out.println("Employee Type :  Part Time");
    System.out.println("Name :"+name);
    System.out.println("Hours Worked :"+hoursworked);
    System.out.println("Hourly Rate :"+ hourlyRate);
    System.out.println("Salary : "+ calculateSalary());
  }
  public static void main(String arg[])throws Exception{
    Employee e1 = new FullTimeEmployee("Naman",50000);
    Employee e2 = new PartTimeEmployee("Rahul",120,400);

         e1.displayDetails();
      System.out.println();

       e2.displayDetails();
  }
}