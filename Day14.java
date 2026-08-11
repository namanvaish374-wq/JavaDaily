//ARRAYLIST

import java.util.*;
class List{
    public static void main(String[] args) {
       ArrayList<Integer> arr= new ArrayList<>();
       //add

       arr.add(10);
       arr.add(20);
       arr.add(30);
       arr.add(40);
       //remove


       arr.remove(0);
       System.out.println(arr);
      
      
       //addAll

       ArrayList<Integer> list2=new ArrayList<>();
        list2.add(101);
        list2.add(103);

        arr.addAll(list2);
        System.out.println(arr);
        arr.removeAll(list2);
        System.out.println(arr);

        //size

        System.out.println(arr.size());

        System.out.println("List 2"+list2);

        //iterator
        Iterator<Integer> i=arr.iterator();
         
        //GEt and Set 
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(11);
        list3.add(12);
        System.out.println(list3.get(0));
        System.out.println("After"+list3);
        list3.set(0,100);
        System.out.println(list3);


        //to Array

        Object[] arr1=list3.toArray();
        for(Object obj: arr1){
            System.out.println(obj);
        }

        //Contains

       System.out.println (list3.contains(1001));

       //Sort

       
       ArrayList<Integer> list4=new ArrayList<>();
        list4.add(60);
        list4.add(20);
        list4.add(30);
        list4.add(12);

        Collections.sort(list4);
        System.out.println(list4);

        //CLONE

        ArrayList<Integer> list5= (ArrayList<Integer>)list4.clone();
        System.out.println(list5);
          

        
    }

}