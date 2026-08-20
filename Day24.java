import java.util.*;
class Day24
{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        
        int n=arr.size();

        for(int i=0;i<n;i++){
            System.out.println(arr.get(i));
        }

        
        for(int x : arr){
            System.out.println(x);
        }

        Iterator<Integer> it=arr.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        for(int i=0;i<n;i++){
        arr.set(i,arr.get(i)*2);
        }

        System.out.println("NEW LIST");
        System.out.println(arr);


    }

}