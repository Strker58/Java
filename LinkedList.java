import java.util.*;

public class LinkedList
{
  Node head=null;
  static class Node
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

  public static LinkedList Delete(LinkedList list, int val)
  {
    if(list.head==null) return null;
    Node currNode=list.head;
    Node Buff_node;
    if(list.head.data==val)
    {
      list.head=null;
      list.head=currNode.next;
    }
    else
    {
      while(currNode.next.data!=val)
      {
        currNode=currNode.next;
      }
      currNode.next=currNode.next.next;
    }
    return list;
  }

public static void display(LinkedList list)
{
  Node curr=list.head;
  while(curr!=null)
  {
    System.out.print(curr.data+" ");
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
  Delete(num,23);
  display(num);
}

}
