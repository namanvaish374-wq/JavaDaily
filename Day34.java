// import java.util.*;
// class Day34 {
//     public static void main(String[] args) {
//         int a;
//         Scanner sc=new Scanner(System.in);
//         HashSet<Integer> arr=new HashSet<>();

//         for(int i=0;i<6;i++)
//         {
//             a=sc.nextInt();
//             arr.add(a);
//         }

//         System.out.println("Uniques Elements");
//         System.out.println(arr);

//         System.out.println("Enter the value to check");
//         int x=sc.nextInt();
//         if(arr.contains(x))
//             System.out.println("Found");
//         else
//             System.out.println("Not Found");
//     }
// }


// HASHMAP


import java.util.*;
class Day34{
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
    
    }
}