//collection framework

import java.util.*;

class LL
{
 public static void main(String args[])
 {
 LinkedList<String> list = new LinkedList<String>();
  list.addFirst("a");
  list.addFirst("is");
  System.out.println(list);

  list.addLast("this");
  System.out.println(list);
  System.out.println(list.size());


  for(int i=0;i<list.size();i++)
  {
    System.out.print(list.get(i)+ " -> ");
  }
  System.out.println("null");
 }
}



// codeeee

class LL
{
    Node head ;
    private int size;

    LL()
    {
        size=0;
    }
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
           this.data=data;
           this.next=null;  
        }
    }
    public void addFirst(String data)
    {
        size++;
        Node newNode=new Node(data);
        if(head == null)
        {
        head=newNode;
        return; 
        }
        newNode.next=head;
        head=newNode; 
    }
     public void addLast(String data){
        size++;
        Node newNode=new Node(data);
        if(head == null)
        {
        head=newNode;
        return; 
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
     }
     public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        Node currNode=head;
        while(currNode!= null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("Null");
     
     }

     //delete first
     public void deletefirst(){
        size--;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
     }

     //delete last
      public void deletelast(){
        size--;
         if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next== null)
        {
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
      }
    public static void main(String arg[])
    {
     LL list=new LL();
     list.addFirst("a");
     list.addFirst("is");
     list.printList();
     list.addLast("list");
      list.printList();
     list.addFirst("this");
     list.printList();
     list.deletefirst();
     list.printList();
    }
}
