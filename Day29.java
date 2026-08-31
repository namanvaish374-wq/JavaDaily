import java.util.*;
class Day29
{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(45);
        arr.add(12);
        arr.add(89);
        arr.add(5);
        arr.add(67);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

        Collections.reverse(arr);

        System.out.println(arr);

        System.out.println(Collections.max(arr));

        System.out.println(Collections.min(arr));

        Collections.shuffle(arr);

        System.out.println(arr);


    }
}