import java.util.*;
class number {
   public static void main(String[] args) {
    HashSet<String> arr=new HashSet<>();
    arr.add("Java");
    arr.add("Python");
    arr.add("c++");
    arr.add("Java");
    arr.add("Python");
    System.out.println(arr);

    System.out.println(arr.size());

    System.out.println(arr.contains("Java"));

    arr.remove("c++");


    System.out.println(arr);
   } 
}