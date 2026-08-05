import java.util.*;
// abstract class Shape{
//     abstract double area();
//     public void display()
//     {
//         System.out.println("Calculating Area....");
//     }
// }
// class Circle extends Shape{
//     int radius;
//     Circle(int a){
//         this.radius=a;
//     }
//     public double area()
//     {
//         return (Math.PI*radius*radius);
//     }
//     @Override
//     public void display(){
//         System.out.println("Hxelo");
//     }
// }
// class Rectangle extends Shape{
//     int l,b;
//     Rectangle(int a,int b){
//         this.l=a;
//         this.b=b;

//     }
//     public double area(){
//         return (l*b);
//     }
// }
// class main{
//     public static void main(String arg[])throws Exception{


//     Shape s1 = new Circle(5);
//     Shape s2 = new Rectangle(4,6);

//     double x=s1.area();
//     double y=s2.area();
//     System.out.println("Area = "+x);
//     System.out.println("Area = "+y);
//     }
// }




abstract class Vehicle{
    String brand;
    int speed;
    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    abstract void fuelType();
    public void displaydetails(){
        System.out.println("Brand : "+brand);
        System.out.println("Speed : "+speed);
    }
}
class car extends Vehicle{
    int seats;
    String fuel;
    car(String brand,int speed,int seats){
        super(brand,speed);
        this.seats=seats;
    }
    public void fuelType(){
      fuel="petrol";
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("Fuel : "+fuel);
        System.out.println("Seats : "+ seats);
    }
}
class Bike extends Vehicle{
    boolean sportsBike;
    String fuel;
    Bike(String Brand,int speed ,boolean s)
    {
        super(Brand, speed);
        this.sportsBike=s;
    }
    public void fuelType(){
        fuel="Petrol";
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("Fuel : "+ fuel);
        System.out.println("Sports Bike : "+ sportsBike);

    }
}
class main{
     public static void main(String arg[])throws Exception{
        Vehicle v1 = new car("BMW",220,5);

        Vehicle v2 = new Bike("BMW",220,true);
        v1.displaydetails();
      v1.fuelType();

     System.out.println();

      v2.displaydetails();
      v2.fuelType();
     }
}