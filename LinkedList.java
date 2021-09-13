import java.util.*;

public class LinkedList
{
  Node head=null;
  class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }
  public static LinkedList Insert(LinkedList list, int data)
  {
    Node new_node=new Node(data);
    new_node.next=null;
    if(list.head==null)
    {
      list.head=new_node;
    }
    else
    {
      Node last=list.head;
      while(last.next!=null)
      {
        last=last.next;
      }
      last.next=new_node;
    }
    return list;
  }
public static void display(LinkedList list)
{
  Node curr=list.head;
  while(curr.next!=null)
  {
    System.out.print(curr+" ");
    curr=curr.next;
  }
  System.out.println();
}

public static void main(String[] args)
{
  LinkedList num=new LinkedList();
  Insert(num,10);
  Insert(num,20);
  Insert(num,23);
  Insert(num,32);
  display(num);
}

}
