// LEARNING EXCEPTION HANDLING.................

import java.util.*;
class BankAccount
{
    private String accountHolder;
    private double balance;
   
     public void setAccountHolder(String a){
        this.accountHolder=a;
    }
     public String getAccountHolder(){
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        {
        
        }
        if(balance>amount)
            balance-=amount;
        else
            System.out.println("Insufficine balance ");

    }
    public void display(){
        System.out.println("Balance is :" +balance);
    }

    public static void main(String arg[])throws Exception{
        BankAccount obj=new BankAccount();
        obj.setAccountHolder("Naman");
        obj.getAccountHolder();
        obj.getBalance();
        obj.deposit(5000);
        obj.withdraw(4500);
        obj.display();
    }
}





class exception{
    public static void main(String arg[])throws Exception{
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
               System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}


class calculator{
    public static void main(String arg[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int ch=5;
        while(ch!=0){
          System.out.println("1 . Addition");
          System.out.println("2. SUbtraction");
          System.out.println("3. Multiplications");
          System.out.println("4.Division");
          System.out.println("Enter your choice");
          ch=sc.nextInt();
          switch(ch){
                case 1:
                  System.out.println(a+b);
                   break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4: 
                try{
                    System.out.println(a/b);
                }    
                catch(Exception e){
                    System.out.println("Cannot divide by zero");
                }
                finally{
                    System.out.println("Thank You");
                }
                break;
               default:
                System.out.println("Invalid choice");
          }
        }
    }
}


class ATM {
    private double balance;
    public double getbalance(){
      return balance;
    }
    public void deposit(double amt){
       if(amt<0)
        System.out.println("Invalid");
        else
        balance+=amt;    
    
    }
    public void withdraw(double amt){
        if(amt<=balance)
            balance-=amt;
        else
            System.out.println("Invalid Balance");
    }
    public void display(){
        System.out.println("Balance is :"+ balance);
    }

    public static void main(String arg[])throws Exception{
      Scanner sc=new Scanner(System.in);
      double a;
      ATM obj=new ATM();
      int ch=5;
      while(ch!=4){
        System.out.println("1. Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3 Display");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        ch=sc.nextInt();

        try{
            switch(ch){
                case 1: 
                 a=sc.nextInt();
                 obj.deposit(a);
                 break;
                 case 2:
                    a=sc.nextInt();
                    obj.withdraw(a);
                    break;
                    case 3:
                        obj.display();
                        break;
                        default: 
                        System.out.println("Invalid choice");
            }
        }
        catch(InputMismatchException e){
          System.out.println("Please enter a valid type");
          sc.next();
        }
        finally{
        System.out.println("THANKYOU");
        }
      }
    }
}