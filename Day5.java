import java.util.*;
class Vechile
{
  String brand;
  Vechile(String a)
  {
    brand=a;
  }
  public void start()
  {
    System.out.println("Vechile is starting.....");

  }
  public void display()
  {
    System.out.println("Brand :" + brand );
  }
}
class child extends Vechile
{
  String model;
  child(String a,String b){
    super(a);
    model=b;
  }
  public void display()
  {
    super.display();
    System.out.println("Model :"+ model);
  }
  public void start()
  {
    super.start();
  }
  public static void main(String arg[])throws Exception{
  String a,b;
  Scanner sc=new Scanner(System.in);
  a=sc.next();
  b=sc.next();
  child obj =new child(a,b);
  obj.display();
  obj.start();
  }
}