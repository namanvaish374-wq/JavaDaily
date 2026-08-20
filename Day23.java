
//ARRAYLIST LEARNING 
import java.util.*;

class Main {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        System.out.println(list.get(1));

        list.set(1,100);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(30));

        ArrayList<String> s1=new ArrayList<>();
        s1.add("Java");
        s1.add("Python");
        s1.add("C++");
        s1.add("Java Script");

        System.out.println(s1);

        s1.set(1,"Go");

        s1.remove("C++");

        System.out.println(s1.contains("Java"));
        
    }

}


