//throw and throws Learning 

import java.util.*;
class age{
    public static void main(String arg[]){
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        try{
            if(age<18)
                throw new Exception("Not eligible for voting");
            if(age>18)
                throw new Exception("Eligible for voting");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Marks{
    static void check(int marks)throws Exception{
        if(marks <0 || marks >100){
            throw new Exception("Marks Invalid");
        }
        System.out.println("Valid marks");
    }
    public static void main(String arg[]){
        try{
            check(120);
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        }
    }
}


class InsufficientBalanceException extends Exception{
     InsufficientBalanceException(String message){
        super(message);
     }
}
class Bank{
    
    static void check(int amt)throws InsufficientBalanceException {
       int balance =5000;
        if(balance < amt ){
          throw new InsufficientBalanceException("Insufficient balace"); 
        }
        System.out.println("Amount withdrawn");
    }
    public static void main(String arg[]){
        try{
            check(6000);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}

