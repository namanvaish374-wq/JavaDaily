//EMPTY SET 

import java.util.*;
class Day35
{
    public static void main(String[] args) {
        HashMap<Integer,String> arr=new HashMap<>();
        arr.put(101,"Naman");
        arr.put(102,"Naitik");
        arr.put(40,"Manan");
        arr.put(104,"Rohit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id to search");
        int x=sc.nextInt();

        if(arr.containsKey(x))
        System.out.println(arr.get(x));
        else
        System.out.println("Employee not found");
        

        for(Map.Entry<Integer,String> e : arr.entrySet() ){
         {
             System.out.println(e.getKey()+" " + e.getValue());
         }
        }
    }
}