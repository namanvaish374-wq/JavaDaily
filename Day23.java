
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

    }

}